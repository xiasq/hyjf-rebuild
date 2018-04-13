package com.hyjf.cs.iam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.alibaba.fastjson.JSONObject;
import com.hyjf.iam.vo.UserVO;
import com.hyjf.iam.exception.MQException;
import com.hyjf.cs.iam.constants.RegisterError;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "用户相关")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@ApiOperation(value = "发送短信", notes = "用户注册发送短信")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "validCodeType", value = "验证码类型", required = true, dataType = "String"),
			@ApiImplicitParam(name = "mobile", value = "手机号码", required = true, dataType = "String"),
	})
	@PostMapping(value = "/sendcode", produces = "application/json; charset=utf-8")
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
	@ApiOperation(value = "注册", notes = "用户注册")
	@ApiImplicitParam(name = "registerVO", value = "注册实体vo", required = true, dataType = "RegisterVO")
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public BaseResultBean register(@RequestBody @Valid RegisterVO registerVO) {
		logger.info("register start, registerVO is :{}", JSONObject.toJSONString(registerVO));
		BaseResultBean resultBean = new BaseResultBean();

		UserVO userVO = userService.register(registerVO);

		if (userVO != null) {
			logger.info("register success, userId is :{}", userVO.getUserId());
		} else {
			logger.error("register failed...");
			resultBean.setStatus("1");
			resultBean.setStatusDesc(RegisterError.REGISTER_ERROR.getMessage());
		}
		return resultBean;
	}

}
