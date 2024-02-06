package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {


    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "제대로 해부리자~!");
        model.addAttribute("data1", "엉딩덩");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name,
                           @RequestParam("age") String age,
                            @RequestParam("score") String score ,Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("score", score);
        return "hello-template";
    }
}
