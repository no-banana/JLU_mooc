package com.jlu_mooc;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 内容管理服务启动类
 */
@SpringBootApplication
@EnableSwagger2Doc // 使用swagger生成接口文档的注解
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}
