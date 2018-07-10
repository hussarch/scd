package com.hussar.app.scd.eraclt2;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/10.
 */
@RestController
@RequestMapping("/")
public class EurakaClientController {

    @RequestMapping("/{name}")
    public String get(@PathVariable("name") String type){
        Random rd = new Random();
        int waitTime = rd.nextInt(3);

        try {
            Thread.sleep(waitTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "client2: welcome " + type + ", access at " + DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date());
    }

}
