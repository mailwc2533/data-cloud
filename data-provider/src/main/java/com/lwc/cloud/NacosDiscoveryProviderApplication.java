package com.lwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by lwc on 2020/7/1.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryProviderApplication.class);
    }
}
