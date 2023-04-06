package idusw.springboot.boardthymeleaf.controller;

import idusw.springboot.boardthymeleaf.entity.MemoEntity;
import idusw.springboot.boardthymeleaf.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
public class RestfulController {    //open-api 작성할 때 많이 사용함, 바로 response-body 반환함
    @Autowired
    MemoRepository memoRepository;  // 필드 주입(injection) : Spring Framework가 필요시점에 객체를 생성해서 주입함

    @GetMapping("/")
    public String getHome() {
        return "welcome-rest-request";  //response-body에 해당하는 자원을 반환
    }

    @GetMapping("/save-memo")
    public String saveMemo() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            MemoEntity memo = MemoEntity.builder().memoText("sample" + i).build();
            memoRepository.save(memo);
        });
        return "insert memo";
    }
}