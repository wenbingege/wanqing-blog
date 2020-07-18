package com.site.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.site.blog.dao")
@SpringBootApplication
public class MyBlogApplication  extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MyBlogApplication.class, args);
        System.out.println("=======您好，婉清系统已启动=======");
    }

    /*将springboot项目打包成war*/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(MyBlogApplication.class);
    }
}
