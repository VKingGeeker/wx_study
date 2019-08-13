package com.ww.wx_study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ww.wx_study.mapper") //扫描的mapper
@SpringBootApplication
public class WxStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxStudyApplication.class, args);
    }

}
