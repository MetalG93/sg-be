package hu.frontside.sgbe.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("hu.frontside.sgbe.*")
public class SgBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgBeApplication.class, args);
    }

}
