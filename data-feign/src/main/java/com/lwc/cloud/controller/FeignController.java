package com.lwc.cloud.controller;

import com.lwc.cloud.entity.FallBack;
import com.lwc.cloud.feign.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwc on 2020/7/1.
 */
@RestController
public class FeignController {

    @Autowired
    IFeignService feignService;

    @GetMapping("/testFeign/{name}")
    public FallBack feign(@PathVariable("name") String name){
        System.out.println("result：" + feignService.hello());
        FallBack fallBack = feignService.hello();
        return fallBack;
    }
}
