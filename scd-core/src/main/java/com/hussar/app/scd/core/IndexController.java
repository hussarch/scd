package com.hussar.app.scd.core;


import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/3.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String hello(){
        return "hello, welcome!" + (DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date()));
    }

    @RequestMapping("/{type}/{name}")
    public String say(@PathVariable("type") String type, @PathVariable("name")String name){
        return String.format("%s here and %s", name, type);
    }

}
