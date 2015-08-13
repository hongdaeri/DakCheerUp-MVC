package fourdrone.dakcheerup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping(method = RequestMethod.GET)
    public String getAccount(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "account/account";
    }
}