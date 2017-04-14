package com.yobing.controller;

import com.yobing.bean.ConfigBeanA;
import com.yobing.bean.ConfigBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yobing Chen
 * @Data : 2017/4/7
 */
@RestController
public class PropertiesController {
    @Autowired
    private ConfigBeanA configBeanA;

    @Autowired
    private ConfigBeanB configBeanB;

    @RequestMapping("/propertiesA")
    public String propertiseHello() {
        return configBeanA.getMsg();
    }
    @RequestMapping("/propertiesB")
    public String propertiseHello1() {
        return configBeanB.getMsg()+configBeanA.getMsg();
    }


}
