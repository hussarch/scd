package com.hussar.app.scd.auth.action;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {


    @RequestMapping("/")
    public String hello(){
        return String.format("Welcome! now is %s", DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.format(new Date()));
    }

    @RequestMapping("/user")
    public Map<String, Object> user(OAuth2Authentication user){
        Map<String, Object> userInfo = new HashMap();
        userInfo.put("user", user.getUserAuthentication().getPrincipal());
        userInfo.put("authorities", AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));
        return userInfo;
    }


}
