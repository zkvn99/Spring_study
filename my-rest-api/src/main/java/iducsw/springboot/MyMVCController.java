package iducsw.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyMVCController {
    @GetMapping("/mvc")
    public String getMVC(Model model) {
        System.out.println("MyMVCController - getMVC()");
        model.addAttribute("attr", "이민욱");
        return "hi-mvc"; // view 파일의 이름
    }
}
