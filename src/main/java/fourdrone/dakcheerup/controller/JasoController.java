package fourdrone.dakcheerup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/jaso")
public class JasoController {
    @RequestMapping(method = RequestMethod.GET)
    public String getJaso(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "jaso/jaso";
    }
}