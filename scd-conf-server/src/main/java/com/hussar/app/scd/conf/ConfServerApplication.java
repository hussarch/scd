package com.hussar.app.scd.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/4.
 */
@SpringBootApplication
@EnableConfigServer
@ComponentScan("com.hussar.app.scd.conf")
public class ConfServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfServerApplication.class, args);
    }

}
