package idusw.springboot.boardthymeleaf.controller;

import idusw.springboot.boardthymeleaf.entity.MemoEntity;
import idusw.springboot.boardthymeleaf.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.IntStream;

@Controller
public class HomeController {
    @Autowired
    MemoService memoService; // MemoService 인터페이스의 구현체를 필드 주입

    @GetMapping("/")
    public String goHome() {
        return "index";
    }
}
