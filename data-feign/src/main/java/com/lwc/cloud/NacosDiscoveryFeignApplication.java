package com.lwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by lwc on 2020/7/1.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosDiscoveryFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryFeignApplication.class);
    }
}
