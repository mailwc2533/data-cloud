package com.lwc.cloud.feign;

import com.lwc.cloud.entity.FallBack;
import com.lwc.cloud.feign.feignImpl.FeignClientFallbackFactory;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Priority;

/**
 * Created by lwc on 2020/7/1.
 */
@FeignClient(name = "data-provider", fallbackFactory = FeignClientFallbackFactory.class)
@Repository
@Primary
public interface IFeignService {

    @GetMapping("/hello")
    FallBack hello();
}
