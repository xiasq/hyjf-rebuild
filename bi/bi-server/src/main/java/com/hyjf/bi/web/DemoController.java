package com.hyjf.bi.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiasq
 * @version DemoController, v0.1 2018/2/2 10:42
 */

@RestController
@RequestMapping("/bi/demo")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Value("${EUREKA.CLIENT.SERVICEURL}")
    private String serverUrl;

    @RequestMapping("/method1")
    public String method1(){
        logger.info("serverUrl is :{}", serverUrl);
        return serverUrl;
    }

}
