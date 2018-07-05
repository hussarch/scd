package com.hussar.app.scd.conf.clt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/5.
 */
@SpringBootApplication
@ComponentScan("com.hussar.app.scd.clt")
public class ConfClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfClientApplication.class, args);
    }

}