package com.hyjf.iam.service;

import com.hyjf.com.request.RegisterUserRequest;
import com.hyjf.common.exception.ServiceException;
import com.hyjf.iam.dao.model.auto.Account;
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

	/**
	 * 根据userId获取账户信息
	 * @param userId
	 * @return
	 */
    Account findAccountByUserId(int userId);

	/**
	 * 根据手机号查找用户信息
	 * @param mobile
	 * @return
	 */
	Users findUserByMobile(String mobile);

	/**
	 * 根据推荐人手机号或userId查询推荐人
	 * @param reffer
	 * @return
	 */
	Users findUserByRecommendName(String reffer);
}
