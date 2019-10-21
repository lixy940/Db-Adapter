package com.lixy.dbadapter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.lixy.dbadapter.dao")
public class DbAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbAdapterApplication.class, args);
    }

}
