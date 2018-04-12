package com.hyjf.iam.controller;

import com.alibaba.fastjson.JSONObject;
import com.hyjf.com.request.RegisterUserRequest;
import com.hyjf.com.response.UserResponse;
import com.hyjf.com.vo.UserVO;
import com.hyjf.dao.model.auto.Users;
import com.hyjf.iam.exception.ServiceException;
import com.hyjf.iam.pojo.User;
import com.hyjf.iam.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author xiasq
 * @version UserController, v0.1 2018/1/21 22:37
 */

@RestController
@RequestMapping("/iam/user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public UserResponse register(HttpServletRequest request, HttpServletResponse response,
			@RequestBody @Valid RegisterUserRequest userRequest) {
		logger.info("user register:" + JSONObject.toJSONString(userRequest));
		UserResponse userResponse = new UserResponse();
		try {
			com.hyjf.dao.model.auto.Users user = userService.register(userRequest);
			if (user == null) {
				userResponse.setRtn(UserResponse.USER_EXISTS);
				userResponse.setMessage(UserResponse.USER_EXISTS_MSG);
				logger.info("user register ,user " + userRequest.getMobilephone() + " has exists");
			} else {
				UserVO userVO = new UserVO();
				BeanUtils.copyProperties(user, userVO);
				userResponse.setResult(userVO);
			}
		} catch (ServiceException e) {
			userResponse.setRtn(UserResponse.FAIL);
			userResponse.setMessage(UserResponse.FAIL_MSG);
			logger.error("user register error", e);
		}
		return userResponse;
	}

	@HystrixCommand(groupKey="IAM",
			commandKey = "UserController.findUserByUserId",
			commandProperties = {
					@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
			},
			threadPoolProperties = {
					@HystrixProperty(name = "coreSize", value = "30"),
					@HystrixProperty(name = "maxQueueSize", value = "101"),
					@HystrixProperty(name = "keepAliveTimeMinutes", value = "2"),
					@HystrixProperty(name = "queueSizeRejectionThreshold", value = "15"),
					@HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "12"),
					@HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "1440")
			})
	@RequestMapping("/findUserByUserId/{userId}")
	public UserResponse findUserByUserId(@PathVariable int userId) {
		UserResponse response = new UserResponse();
		Users user = userService.findUserByUserId(userId);
		if (user != null) {
			UserVO userVO = new UserVO();
			BeanUtils.copyProperties(user, userVO);
			response.setResult(userVO);
		}
		return response;
	}
}
