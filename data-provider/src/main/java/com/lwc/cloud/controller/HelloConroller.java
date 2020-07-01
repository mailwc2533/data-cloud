package com.lwc.cloud.controller;

import com.lwc.cloud.entity.FallBack;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwc on 2020/7/1.
 */
@RestController
public class HelloConroller {
    @Value("${server.port:9091}")
    Integer port;

    @GetMapping("/hello")
    public FallBack sayHello() throws Exception {
        throw  new Exception("getUserByIdException");
    }
}
