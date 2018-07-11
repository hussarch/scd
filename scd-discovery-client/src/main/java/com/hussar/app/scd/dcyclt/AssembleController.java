package com.hussar.app.scd.dcyclt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/11.
 */
@RestController
@RequestMapping("/app")
public class AssembleController {

    @RequestMapping("/{name}")
    public String get(@PathVariable("name") String name){
        
    }



}
