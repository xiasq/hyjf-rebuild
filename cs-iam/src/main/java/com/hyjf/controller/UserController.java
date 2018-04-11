package com.hyjf.controller;

import javax.validation.Valid;

import com.alibaba.fastjson.JSONObject;
import com.hyjf.com.vo.UserVO;
import com.hyjf.constants.RegisterError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hyjf.result.BaseResultBean;
import com.hyjf.service.UserService;
import com.hyjf.vo.RegisterVO;

/**
 * @author xiasq
 * @version UserController, v0.1 2018/4/11 9:27
 */

@RestController
@RequestMapping("/user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

    /**
     * 注册
     * @param registerVO
     * @return
     */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public BaseResultBean register(@RequestBody @Valid RegisterVO registerVO) {
		logger.info("register start, registerVO is :{}", JSONObject.toJSONString(registerVO));
		BaseResultBean resultBean = new BaseResultBean();

		UserVO userVO = userService.register(registerVO);

		if (userVO != null) {
			logger.info("register success, userId is :{]", userVO.getUserId());
		} else {
			logger.error("register failed...");
			resultBean.setStatus("1");
			resultBean.setStatusDesc(RegisterError.REGISTER_ERROR.getMessage());
		}
		return resultBean;
	}

}
