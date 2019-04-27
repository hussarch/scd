package com.hussar.app.scd.eraclt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 肖毅(hussarch@126.com) on 18/7/10.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.hussar.app.scd.eraclt2")
public class EurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }

}
