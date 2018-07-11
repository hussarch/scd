package com.hussar.app.scd.dcyclt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

/**
 * Created by 肖毅(xiaoyi@shhxzq.com) on 18/7/11.
 */
@Component
public class CommonDiscoveryClient {

    @Autowired
    private DiscoveryClient discoveryClient;




}
