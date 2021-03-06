package com.hyjf.cs.iam.service;

import com.hyjf.iam.request.RegisterUserRequest;
import com.hyjf.iam.vo.UserVO;

/**
 * @author xiasq
 * @version IamService, v0.1 2018/4/11 9:33
 */
public interface IamService {
	UserVO findUserByMobile(String mobile);

	int updateCheckMobileCode(String mobile, String verificationCode, String verificationType, String platform,
			Integer searchStatus, Integer updateStatus);

	int countUserByRecommendName(String reffer);

	UserVO register(RegisterUserRequest request);

	UserVO getUserById(int userId);

	int saveSmsCode(String mobile, String checkCode, String validCodeType, Integer status, String platform);
}
