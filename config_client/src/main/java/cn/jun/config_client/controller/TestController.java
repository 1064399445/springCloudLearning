package cn.jun.config_client.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RefreshScope
@RestController
public class TestController {



//    @Resource
//    private Environment env;
    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

//    @RequestMapping("/fromEnv")
//    public String fromEnv() {
//        return JSON.toJSONString(env.getPropertySources());
//    }
}
