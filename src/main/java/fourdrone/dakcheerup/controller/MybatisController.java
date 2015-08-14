package fourdrone.dakcheerup.controller;

import fourdrone.dakcheerup.dao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * Created by h0ngz on 2015. 8. 15..
 */
@Controller
public class MybatisController {
    @Autowired UserService userService;

    @RequestMapping(value ="/test" , method= RequestMethod.GET)
    public void mybatisTest(Locale locale, Model model)
    {
        model.addAttribute("list",userService.list());

        System.out.println(model.toString());
    }

}
