package fourdrone.dakcheerup.controller;

import fourdrone.dakcheerup.domain.member.Member;
import fourdrone.dakcheerup.service.AccountService;
import fourdrone.dakcheerup.util.DES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;


@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired  private AccountService accountService;


    // 로그인 화면 처리
    @RequestMapping(method = RequestMethod.GET)
    public String getAccount(@RequestParam(value="error", required=false) String error, ModelMap model, HttpServletRequest request, HttpSession session) {

        // 자동로그인 - Id, Pw 쿠키 존재하면 자동로그인
        String memberId = null;
        String memberPassword = null;
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("mi"))
                memberId = cookies[i].getValue();
            if (cookies[i].getName().equals("mp"))
                memberPassword = cookies[i].getValue();
        }
        // 쿠키상에 id와 pw가 모두 있다면
        if(memberId!=null && memberPassword != null)
        {
            //복호화 한뒤
            Member member = new Member();
            member.setMemberId(DES.decrypt(memberId));
            member.setMemberPassword(DES.decrypt(memberPassword));
            //로그인 처리 하기.
            Member loginMember = this.accountService.getMemberForLogin(member);
            session.setAttribute("memberLoginInfo", loginMember.getMemberId());
            return "redirect:test";
        }
        else
        {
            return "account/account";
        }
   }

    //테스트
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test(ModelMap model) {
        List<Member> memberList = this.accountService.getMemberList();
        model.addAttribute("result", memberList);

        return "account/test";
    }

    //로그인 처리
    @RequestMapping(value ="/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("member") Member member, HttpSession session, HttpServletResponse response, HttpServletRequest request){
        Member loginMember = this.accountService.getMemberForLogin(member);
        if(loginMember != null)
        {

             if (request.getParameter("autoLogin")!=null) {
                // 암호화
                String en_id = DES.encrypt(loginMember.getMemberId());
                String en_pw = DES.encrypt(loginMember.getMemberPassword());

                Cookie miCookie = new Cookie("mi", en_id);
                miCookie.setMaxAge(30 * 24 * 60 * 60);
                response.addCookie(miCookie);

                Cookie mpCookie = new Cookie("mp", en_pw);
                mpCookie.setMaxAge(30 * 24 * 60 * 60);
                response.addCookie(mpCookie);
            }

            session.setAttribute("memberLoginInfo",loginMember.getMemberId());
            return "redirect:test";
        }
        else {
            return "redirect:";
        }

    }
    // 로그아웃 처리
    @RequestMapping(value ="/logout", method = RequestMethod.GET)
    public String logout(HttpSession session, HttpServletResponse response, HttpServletRequest request) {

        // 쿠키 삭제
        Cookie[] cookies = request.getCookies();
        for(int i=0; i < cookies.length; i++)
        {
            cookies[i].setMaxAge(0);
            response.addCookie(cookies[i]);
        }

        // 세션 삭제.
        session.setAttribute("memberLoginInfo", null);
        return "account/account";
    }

    //회원가입 처리
    @RequestMapping(value ="/signUp", method = RequestMethod.POST)
    public String signUp(@ModelAttribute("member") Member member) {

        member.setRegDate(new Timestamp(System.currentTimeMillis()));
        this.accountService.addMember(member);
        return "redirect:test";
    }

}