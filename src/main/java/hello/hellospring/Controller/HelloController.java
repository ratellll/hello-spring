package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
                           @RequestParam("score") String score, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("score", score);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello"+name;

    }
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.name = "빈이";
        return hello;

    }

    static class Hello{

        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
