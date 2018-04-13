package com.hyjf.cs.iam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyjf.cs.iam.service.IamService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author xiasq
 * @version DemoController2, v0.1 2018/4/12 21:22
 */

@RestController
@RequestMapping("/demo2")
public class DemoController2 {

    @Autowired
    private IamService iamService;

    @GetMapping("/test")
    @HystrixCommand
    public String demo1(){
        iamService.getUserById(1);
        return "demo2";
    }

}
