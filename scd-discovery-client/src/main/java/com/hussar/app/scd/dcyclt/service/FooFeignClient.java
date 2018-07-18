package com.hussar.app.scd.dcyclt.service;

import com.hussar.app.scd.dcyclt.model.Foo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/12.
 */
@FeignClient(name = "client1", qualifier = "fooFeignClient")
public interface FooFeignClient extends FooService{

    @RequestMapping(
            method= RequestMethod.GET,
            value="/app/foos//{size}",
            consumes="application/json")
    List<Foo> getFooList(@PathVariable("size") Integer size);
}
