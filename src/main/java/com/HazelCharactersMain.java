package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan(basePackageClasses = HazelCharactersMain.class)
@SpringBootApplication
public class HazelCharactersMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HazelCharactersMain.class, args);
    }
}
