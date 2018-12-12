package com.hxxzt.springbootorache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hxxzt.springbootorache.dao")
public class SpringbootOracheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOracheApplication.class, args);
    }
}
