package com.hyjf.mc.controller;

import com.hyjf.mc.bean.DemoBean;
import com.hyjf.mc.mongo.TestMongoDao;
import com.hyjf.mc.redis.StringRedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyjf.mc.redis.RedisUtils;

/**
 * @author xiasq
 * @version DemoController, v0.1 2018/4/18 15:36
 */

@RestController
@RequestMapping
public class DemoController {
    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    StringRedisUtil stringRedisUtil;

    @Autowired
    TestMongoDao testMongoDao;

    @RequestMapping("/redis/write/{key}/{value}")
    public String testRedisWrite(@PathVariable String key, @PathVariable String value){
        logger.info("key:{},value:{}",key,value);
        redisUtils.set(key,value);
        return "success";
    }

    @RequestMapping("/redis/read/{key}")
    public String testRedisRead(@PathVariable String key){
        logger.info("key:{}",key);
        String value = stringRedisUtil.get(key);
        return value;
    }

    @RequestMapping("/mongo/save/{userId}/{name}")
    public int testSaveMongo(@PathVariable int userId,@PathVariable String name){
        logger.info("name: {}",name);
        DemoBean demoBean = new DemoBean(userId, name);
        return testMongoDao.save(demoBean);
    }

    @RequestMapping("/mongo/get/{userId}")
    public String testMongo(@PathVariable int userId){
        logger.info("userId: {}",userId);
        return testMongoDao.getNameByUserId(userId);
    }
}
