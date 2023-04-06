package idusw.springboot.boardthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
        //(exclude = DataSourceAutoConfiguration.class)
public class BoardThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardThymeleafApplication.class, args);
    }

}
