package com.hyjf.cs.iam.service;

import com.hyjf.com.request.RegisterUserRequest;
import com.hyjf.com.vo.UserVO;

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
}
