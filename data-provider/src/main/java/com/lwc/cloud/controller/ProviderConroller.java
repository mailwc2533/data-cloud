package com.lwc.cloud.controller;

import com.lwc.cloud.entity.FallBack;
import com.lwc.cloud.entity.Person;
import com.lwc.cloud.model.dto.PersonDto;
import com.lwc.cloud.model.vo.PersonVo;
import com.lwc.cloud.model.vo.ResponseVo;
import com.lwc.cloud.redis.RedisTemplateCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lwc on 2020/7/1.
 */
@RestController
public class ProviderConroller {

    @Autowired
    private RedisTemplateCache redisTemplateCache;

    @Value("${server.port:9091}")
    Integer port;

    @GetMapping("/hello")
    public FallBack sayHello() throws Exception {
        throw  new Exception("getUserByIdException");
    }

    @PostMapping("/testPostRedis")
    public ResponseVo testRedis(@RequestBody PersonDto personDto) {
        Person person = new Person();
        person.setId(1l);
        person.setName(personDto.getName());
        person.setPhone(personDto.getPhone());
        person.setAge(personDto.getAge());
        person.setGender(personDto.getGender());
        redisTemplateCache.set("testPostRedis", person, 100);
        return ResponseVo.success();
    }

    @GetMapping("/testGetRedis/{key}")
    public ResponseVo testRedis(@PathVariable("key") String key) throws Exception {
        Person person = (Person) redisTemplateCache.get(key);
        PersonVo personVo = new PersonVo();
        if (person != null){
            personVo.setName(person.getName());
            personVo.setAge(person.getAge());
            personVo.setGender(person.getGender());
            personVo.setPhone(person.getPhone());
        } else
            return ResponseVo.fail("key not found on redis");
        return ResponseVo.success(personVo);
    }
}
