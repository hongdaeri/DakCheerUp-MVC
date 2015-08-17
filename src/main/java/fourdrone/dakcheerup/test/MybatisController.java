package fourdrone.dakcheerup.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by h0ngz on 2015. 8. 16..
 * 컨트롤러 부분으로서 DB로부터 가져온값을 view화면으로 보내어준다.

 */
@Controller
public class MybatisController {

    @Autowired
    private MemberDAO memberDao;

    private static final Logger logger = LoggerFactory.getLogger(MybatisController.class);


    //시작 메인화면.
    @RequestMapping("/main")
    public String main(Model model) {
        List<Member> memberList = memberDao.getMembers();
        model.addAttribute("result", memberList);

        return "result";
    }

    @RequestMapping(value ="/insert", method = RequestMethod.POST)
    public String insert(@ModelAttribute("member") Member member){

        System.out.println("test : " + member.getName());
        System.out.println("test : " + member.getEmail());
        System.out.println("test : " + member.getPhone());

        this.memberDao.insertMember(member);

        return "redirect:main";

    }
}