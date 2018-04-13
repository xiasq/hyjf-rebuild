package com.hyjf.cs.iam.controller;

import com.hyjf.cs.iam.service.IamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiasq
 * @version DemoController1, v0.1 2018/4/12 21:22
 */

@RestController
@RequestMapping("/demo1")
public class DemoController1 {
    @Autowired
    private IamService iamService;
    @RequestMapping("/test")
    public String demo1(){
        iamService.getUserById(1);
        return "demo1";
    }

}
