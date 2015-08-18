package fourdrone.dakcheerup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/resume")
public class ResumeController {

   // @Autowired private ResumeService resumeService;


/*
    @RequestMapping(value ="/insert", method = RequestMethod.POST)
    public String insert(@ModelAttribute("member") Member member){

        System.out.println("test : " + member.getName());
        System.out.println("test : " + member.getEmail());
        System.out.println("test : " + member.getEmail());
        System.out.println("test : " + member.getName());

        this.resumeService.insertMember(member);

        return "redirect:main";

    }*/



    @RequestMapping(value="", method = RequestMethod.GET)
    public String getResume(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume";
    }



    @RequestMapping(value="/profile", method = RequestMethod.GET)
    public String getResumeProfile(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-profile";
    }

    @RequestMapping(value="/addtion-profile", method = RequestMethod.GET)
    public String getResumeAddtionProfile(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-addtion-profile";
    }

    @RequestMapping(value="/academic", method = RequestMethod.GET)
    public String getResumeAcademic(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-academic";
    }

    @RequestMapping(value="/oa", method = RequestMethod.GET)
    public String getResumeOA(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-oa";
    }

    @RequestMapping(value="/character", method = RequestMethod.GET)
    public String getResumeCharacter(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-character";
    }

    @RequestMapping(value="/license", method = RequestMethod.GET)
    public String getResumeLicense(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-license";
    }

    @RequestMapping(value="/lang-ability", method = RequestMethod.GET)
    public String getResumeLangAbility(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-lang-ability";
    }

    @RequestMapping(value="/lang-exam", method = RequestMethod.GET)
    public String getResumeLangExam(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-lang-exam";
    }
    @RequestMapping(value="/award", method = RequestMethod.GET)
    public String getResumeAward(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-award";
    }

    @RequestMapping(value="/career", method = RequestMethod.GET)
    public String getResumeCareer(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-career";
    }

    @RequestMapping(value="/voluntary", method = RequestMethod.GET)
    public String getResumeVoluntary(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-voluntary";
    }

    @RequestMapping(value="/education", method = RequestMethod.GET)
      public String getResumeEducation(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-education";
    }

    @RequestMapping(value="/project", method = RequestMethod.GET)
      public String getResumeProject(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-project";
    }

    @RequestMapping(value="/write", method = RequestMethod.GET)
    public String getResumeWrite(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-write";
    }

    @RequestMapping(value="/global", method = RequestMethod.GET)
    public String getResumeGlobal(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-global";
    }

    @RequestMapping(value="/swot", method = RequestMethod.GET)
    public String getResumeSwot(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-swot";
    }

    @RequestMapping(value="/config", method = RequestMethod.GET)
    public String getResumeConfig(ModelMap model) {
        model.addAttribute("message", "Hello world!!!");
        return "resume/resume-config";
    }
}