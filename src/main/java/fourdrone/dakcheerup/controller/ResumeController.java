package fourdrone.dakcheerup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/resume")
public class ResumeController {
    @RequestMapping(method = RequestMethod.GET)
    public String getResume(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume";
    }
}