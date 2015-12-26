package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@MapperScan("com.demo.dao")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        new SpringApplicationBuilder()
        .bannerMode(Banner.Mode.OFF)
        .sources(DemoApplication.class)
        .run(args);
        System.out.println("========RUN CEF=======");
    }
}
