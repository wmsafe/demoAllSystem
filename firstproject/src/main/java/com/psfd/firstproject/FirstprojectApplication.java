package com.psfd.firstproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.psfd.firstproject.mapper")
public class FirstprojectApplication {

    public static void main(String[] args) {

        SpringApplication.run(FirstprojectApplication.class, args);
    }

}
