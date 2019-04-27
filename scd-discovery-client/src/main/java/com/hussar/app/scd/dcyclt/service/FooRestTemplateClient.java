package com.hussar.app.scd.dcyclt.service;

import com.hussar.app.scd.dcyclt.model.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by 肖毅(hussarch@126.com) on 18/7/12.
 */
@Component("fooRestTemplateClient")
public class FooRestTemplateClient implements FooService{

    @Autowired
    private RestTemplate restTemplate;

    public List<Foo> getFooList(Integer size){
        String url = "http://client1/app/foos/" + size;
        ParameterizedTypeReference<List<Foo>> type = new ParameterizedTypeReference<List<Foo>>(){};
        ResponseEntity<List<Foo>> restExchange = restTemplate.exchange(url, HttpMethod.GET, null, type, size);
        return restExchange.getBody();
    }

}
