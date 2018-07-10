package com.hussar.app.scd.eraclt1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/10.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.hussar.app.scd.eraclt1")
public class EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }

}
