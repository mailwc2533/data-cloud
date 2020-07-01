package com.lwc.cloud.feign.feignImpl;

import com.lwc.cloud.entity.FallBack;
import com.lwc.cloud.feign.IFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by lwc on 2020/7/1.
 */

@Slf4j
@Service
public class IFeignServiceImpl implements IFeignService {
    @Override
    public FallBack hello() {
        return new FallBack("fallback", 500);
    }
}
