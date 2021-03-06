package com.yisutech.iisp.starter;

import com.yisutech.iisp.toolkit.utils.SpringHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@MapperScan("com.yisutech.iisp.dataops.repository.mapper")
@ComponentScan("com.yisutech.iisp")
public class StarterApplication {

    @Resource
    private SpringHelper springHelper; //初始化工具类

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }
}
