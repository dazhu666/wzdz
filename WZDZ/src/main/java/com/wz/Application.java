package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2017/8/24.
 */
@EnableScheduling
@SpringBootApplication
public class Application {
    public static void main(String[] arg){
        SpringApplication.run(Application.class,arg);
    }
}
