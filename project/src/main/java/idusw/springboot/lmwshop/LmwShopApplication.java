package idusw.springboot.lmwshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LmwShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmwShopApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "<h1> welcome Spring boot";
    }

}
