package com.eureka.client.controller;

import com.eureka.client.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        logger.info("/hello，world");
        return "hello world";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        return "hello " + user.getName() + ", " + user.getAge();
    }

}
