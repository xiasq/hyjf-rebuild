package com.hyjf.controller;

import com.hyjf.result.BaseResultBean;
import com.hyjf.service.UserService;
import com.hyjf.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author xiasq
 * @version UserController, v0.1 2018/4/11 9:27
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BaseResultBean register(@RequestBody @Valid RegisterVO registerVO){
        BaseResultBean resultBean = new BaseResultBean();

        userService.register(registerVO);

        return resultBean;
    }


}
