package com.hyjf.iam.service;

import com.hyjf.com.request.RegisterUserRequest;
import com.hyjf.common.exception.ServiceException;
import com.hyjf.iam.dao.model.auto.Users;

/**
 * @author xiasq
 * @version UserService, v0.1 2018/1/21 22:42
 */
public interface UserService {
	Users register(RegisterUserRequest userRequest) throws ServiceException;

	Users findUserByUserId(int userId);

	/**
	 * 获取唯一用户id
	 * 
	 * @param mobile
	 * @return
	 */
	String getUniqueUsername(String mobile);
}
