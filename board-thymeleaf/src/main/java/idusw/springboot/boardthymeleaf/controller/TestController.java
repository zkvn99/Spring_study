package idusw.springboot.boardthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/no-rest")
    public String getHome() {
        return "welcome-rest-request";  //view 이름을 반환함
    }
}
