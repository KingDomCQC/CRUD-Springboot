package com.example.crudspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.crudspringboot.Mapper")
public class CrudSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringbootApplication.class, args);
    }

}
