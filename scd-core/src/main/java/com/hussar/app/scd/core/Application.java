package com.hussar.app.scd.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 肖毅(hussarch@126.com) on 18/7/3.
 */
@SpringBootApplication
@ComponentScan("com.hussar.app.scd")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
