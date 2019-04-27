package com.hussar.app.scd.erasvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 肖毅(hussarch@126.com) on 18/7/10.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
