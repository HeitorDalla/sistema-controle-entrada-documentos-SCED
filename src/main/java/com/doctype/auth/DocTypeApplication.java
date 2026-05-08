package com.doctype.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.doctype"})
public class DocTypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocTypeApplication.class, args);
    }

}
