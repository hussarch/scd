package com.hussar.app.scd.dcyclt.service;

import com.hussar.app.scd.dcyclt.model.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/11.
 */
@Component("fooDiscoveryClient")
public class FooDiscoveryClient implements FooService{

    @Autowired
    private DiscoveryClient discoveryClient;

    public List<Foo> getFooList(Integer size){
        List<ServiceInstance> instances = discoveryClient.getInstances("client1");
        if(instances.isEmpty()){
            return null;
        }
        ServiceInstance instance = instances.get(0);
        RestTemplate restTemplate = new RestTemplate();
        String url = instance.getUri().toString() + "/app/foos/" + size;
        ParameterizedTypeReference<List<Foo>> type = new ParameterizedTypeReference<List<Foo>>(){};
        ResponseEntity<List<Foo>> restExchange = restTemplate.exchange(url, HttpMethod.GET, null, type, size);
        return restExchange.getBody();
    }


}
