package fourdrone.dakcheerup.controller;

import fourdrone.dakcheerup.domain.member.Member;
import fourdrone.dakcheerup.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired  private AccountService accountService;


    // 로그인 화면 처리
    @RequestMapping(method = RequestMethod.GET)
    public String getAccount(@RequestParam(value="error", required=false) String error, ModelMap model) {

        return "account/account";
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
    public String login(@ModelAttribute("member") Member member, HttpSession session){
        Member loginMember = this.accountService.getMemberForLogin(member);
        if(loginMember != null)
        {
            session.setAttribute("memberLoginInfo",loginMember.getMemberId());
            return "redirect:test";
        }
        else {
            return "redirect:";
        }

    }
    // 로그아웃 처리
    @RequestMapping(value ="/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.setAttribute("memberLoginInfo", null);
        return "account/account";
    }

    //회원가입 처리
    @RequestMapping(value ="/signUp", method = RequestMethod.POST)
    public String signUp(@ModelAttribute("member") Member member){

        member.setRegDate(new Timestamp(System.currentTimeMillis()));
        this.accountService.addMember(member);
        return "redirect:test";
    }

}