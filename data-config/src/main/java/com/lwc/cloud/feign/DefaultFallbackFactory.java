package com.lwc.cloud.feign;

import feign.FeignException;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 默认的FallbackFactory，简单打印日志，返回fallback实现类
 */
@Slf4j
public class DefaultFallbackFactory<T, F extends T> implements FallbackFactory<T> {

    @Autowired
    private F fallback;

    //TODO 实现切面，触发fallback时，打印请求参数到日志中
    @Override
    public T create(Throwable cause) {
//        FeignException feignException = (FeignException) cause;
//        log.error("call remote error, http status:{}, message:{}", feignException.status(), feignException.getMessage(), feignException);
        return fallback;
    }
}
