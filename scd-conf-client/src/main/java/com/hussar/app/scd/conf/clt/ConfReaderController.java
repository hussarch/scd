package com.hussar.app.scd.conf.clt;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.StandardServletEnvironment;

import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.List;


/**
 * Created by 肖毅(hussarch@126.com) on 18/7/5.
 */
@RestController
public class ConfReaderController{

    @Value("${hello.msg.xx}")
    private String properValue;

    @RequestMapping("/properties")
    public String getAllProperties(){
        return properValue;
    }



}
