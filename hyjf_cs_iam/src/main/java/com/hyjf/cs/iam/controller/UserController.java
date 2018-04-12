package com.hyjf.cs.iam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.alibaba.fastjson.JSONObject;
import com.hyjf.com.vo.UserVO;
import com.hyjf.common.exception.MQException;
import com.hyjf.cs.iam.constants.RegisterError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hyjf.cs.iam.result.BaseResultBean;
import com.hyjf.cs.iam.service.UserService;
import com.hyjf.cs.iam.vo.RegisterVO;

/**
 * @author xiasq
 * @version UserController, v0.1 2018/4/11 9:27
 */

@RestController
@RequestMapping("/api/user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/sendcode", produces = "application/json; charset=utf-8")
	public BaseResultBean sendSmsCode(@RequestParam String validCodeType, @RequestParam String mobile,
			HttpServletRequest request) throws MQException {
		logger.info("sendSmsCode start, validCodeType is :{}, mobile is: {}", validCodeType, mobile);
		BaseResultBean resultBean = new BaseResultBean();
		userService.sendSmsCode(validCodeType, mobile, request);
		return resultBean;
	}

	/**
	 * 注册
	 * 
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
