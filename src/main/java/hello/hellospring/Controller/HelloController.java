package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "제대로 해부리자~!");
        model.addAttribute("data1", "엉딩덩");
        return "hello";
    }
}
