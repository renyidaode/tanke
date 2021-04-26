package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.demo.mapper", "com.example.demo.dao"})
public class TankeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TankeApplication.class, args);
    }

}
