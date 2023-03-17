package com.yjk.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.yjk.demo"})
@EnableSwagger2
@MapperScan("com.yjk.demo.**.mapper")
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);
    }

}
