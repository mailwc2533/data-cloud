package com.lwc.cloud.feign.feignImpl;

import com.lwc.cloud.feign.DefaultFallbackFactory;
import com.lwc.cloud.feign.IFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by lwc on 2020/7/1.
 */
@Slf4j
@Component
public class FeignClientFallbackFactory extends DefaultFallbackFactory<IFeignService, IFeignServiceImpl> {
}
