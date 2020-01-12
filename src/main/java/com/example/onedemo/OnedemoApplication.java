package com.example.onedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.onedemo.mapper")
@SpringBootApplication
public class OnedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnedemoApplication.class, args);
    }

}
