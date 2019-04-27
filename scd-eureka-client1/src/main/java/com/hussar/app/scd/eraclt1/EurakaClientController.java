package com.hussar.app.scd.eraclt1;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by 肖毅(hussarch@126.com) on 18/7/10.
 */
@RestController
@RequestMapping("/app")
public class EurakaClientController {

    @RequestMapping("/{name}")
    public String get(@PathVariable("name") String name){
        Random rd = new Random();
        int waitTime = rd.nextInt(5);

        try {
            Thread.sleep(waitTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "client1: hello " + name + ", access at " + DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date());
    }

    @RequestMapping("/foo/{id}")
    public Foo getFoo(@PathVariable("id") Integer id){
        Random rd = new Random();
        int waitTime = rd.nextInt(5);
        try {
            Thread.sleep(waitTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Foo(id, "xxx", "This item uuid is " + UUID.randomUUID());

    }

    @RequestMapping("/foos/{size}")
    public List<Foo> getFooList(@PathVariable("size") Integer size){
        Random rd = new Random();
        int waitTime = rd.nextInt(5);
        try {
            Thread.sleep(waitTime * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Foo> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(new Foo(i + rd.nextInt(100), "mke_" + i, "This item uuid is " + UUID.randomUUID()));
        }
        return list;
    }

}
