package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2017/8/24.
 */
@EnableScheduling
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
    public static void main(String[] arg){
        SpringApplication.run(Application.class,arg);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
