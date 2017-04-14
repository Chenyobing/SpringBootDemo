package com.yobing.controller;

import com.yobing.entity.DemoEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author : yobing Chen
 * @Data : 2017/3/28
 */
//在这里我们使用RestController （等价于@Controller 和 @ResponseBody）
@RestController
public class HelloController {

    /**
     * 这里使用@RequestMapping 建立请求映射 ：http://localhost:8080/hello
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    /**
     * Spring Boot默认使用的解析框架是jackson
     * @return
     */
    @RequestMapping("/getDemo")
    public DemoEntity getDemo() {
        DemoEntity demo = new DemoEntity();
        demo.setId(1);
        demo.setName("张三-2017");
        demo.setCreateTime(new Date());
        return demo;
    }
    //此方法测试全局异常捕捉
    @RequestMapping("/hello2")
    public String hello2() {
        throw new RuntimeException();
        //return "hello2";
    }
}
