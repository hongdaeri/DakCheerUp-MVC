package fourdrone.dakcheerup.controller;

import fourdrone.dakcheerup.domain.member.Member;
import fourdrone.dakcheerup.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired  private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAccount(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "account/account";    }


    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test(ModelMap model) {
        List<Member> memberList = this.accountService.getMemberList();
        model.addAttribute("result", memberList);

        return "account/test";
    }

    @RequestMapping(value ="/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("member") Member member){

        return "redirect:main";
    }

    @RequestMapping(value ="/signUp", method = RequestMethod.POST)
    public String signUp(@ModelAttribute("member") Member member){
        member.setRegDate(new Timestamp(System.currentTimeMillis()));
        this.accountService.addMember(member);
        return "redirect:main";
    }
}