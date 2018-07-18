package com.hussar.app.scd.dcyclt;

import com.hussar.app.scd.dcyclt.model.Foo;
import com.hussar.app.scd.dcyclt.service.FooFeignClient;
import com.hussar.app.scd.dcyclt.service.FooService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/11.
 */
@RestController
@RequestMapping("/app")
public class AssembleController {

    @Autowired
    @Qualifier("fooDiscoveryClient")
    private FooService fooDiscoveryClient;

    @Autowired
    @Qualifier("fooRestTemplateClient")
    private FooService fooRestTemplateClient;

    @Autowired
    @Qualifier("fooFeignClient")
    private FooService fooFeignClient;

    @RequestMapping("/foos/{type}/{size}")
    public List<Foo> getFooList(@PathVariable("type") String type, @PathVariable("size") Integer size){
        if(StringUtils.equals(type, "dc")){
            return fooDiscoveryClient.getFooList(size);
        }else if(StringUtils.equals(type, "rtc")){
            return fooRestTemplateClient.getFooList(size);
        }else if(StringUtils.equals(type, "fc")){
            return fooFeignClient.getFooList(size);
        }else{
            return null;
        }
    }





}
