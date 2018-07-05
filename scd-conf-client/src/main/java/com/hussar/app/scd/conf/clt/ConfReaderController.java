package com.hussar.app.scd.conf.clt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/5.
 */
@RestController
public class ConfReaderController {

    @Value("${hello.msg}")
    private String properValue;

    @RequestMapping("/properties")
    public String getAllProperties(){
        return properValue;
    }

}
