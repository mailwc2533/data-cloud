package com.lwc.cloud.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by lwc on 2020/7/3.
 */
@Component
public class RedisTemplateCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate = new RedisTemplate();

    public boolean expire(String key, long time){
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 根据key 获取过期时间
     * @param key 键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public void set(String key, Object value, Integer expire){
        redisTemplate.opsForValue().set(key, value, expire, TimeUnit.SECONDS);
    }

}
