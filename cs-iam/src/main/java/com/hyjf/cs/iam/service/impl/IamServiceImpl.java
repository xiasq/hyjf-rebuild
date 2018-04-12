package com.hyjf.cs.iam.service.impl;

import com.hyjf.com.request.RegisterUserRequest;
import com.hyjf.com.request.SmsCodeRequest;
import com.hyjf.com.response.SmsCodeResponse;
import com.hyjf.com.response.UserResponse;
import com.hyjf.com.vo.UserVO;
import com.hyjf.cs.iam.service.IamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiasq
 * @version IamServiceImpl, v0.1 2018/4/11 9:33
 */
@Service
public class IamServiceImpl implements IamService {
	private static Logger logger = LoggerFactory.getLogger(IamServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public UserVO findUserByMobile(String mobile) {
		UserResponse response = null;
		try {
			response = restTemplate.getForEntity("http://IAM/iam/user/findUserByMobile/" + mobile, UserResponse.class)
					.getBody();
			if (response != null) {
				return response.getResult();
			}
		} catch (RestClientException e) {
			logger.error("findUserByMobile failed...", e);
		}
		return null;
	}

	@Override
	public int updateCheckMobileCode(String mobile, String verificationCode, String verificationType, String platform,
			Integer searchStatus, Integer updateStatus) {
		SmsCodeRequest request = new SmsCodeRequest();
		request.setMobile(mobile);
		request.setVerificationCode(verificationCode);
		request.setVerificationType(verificationType);
		request.setPlatform(platform);
		request.setSearchStatus(searchStatus);
		request.setUpdateStatus(updateStatus);

		try {
			restTemplate.postForEntity("http://IAM/iam/user/findUserByRecommendName/", request, SmsCodeResponse.class)
					.getBody();
			return 1;
		} catch (RestClientException e) {
			logger.error("updateCheckMobileCode failed...", e);
		}
		return 0;
	}

	/**
	 * 根据推荐人手机号或userId查询推荐人
	 */
	@Override
	public int countUserByRecommendName(String reffer) {
		UserResponse response = null;
		try {
			response = restTemplate
					.getForEntity("http://IAM/iam/user/findUserByRecommendName/" + reffer, UserResponse.class)
					.getBody();
			if (response != null && response.getResult() != null) {
				return 1;
			}
		} catch (RestClientException e) {
			logger.error("getUserByUserId failed...", e);
		}
		return 0;
	}

	@Override
	public UserVO register(RegisterUserRequest request) {
		UserResponse response = null;
		try {
			response = restTemplate.postForEntity("http://IAM/iam/user/register", request, UserResponse.class)
					.getBody();
			if (response != null) {
				return response.getResult();
			}
		} catch (RestClientException e) {
			logger.error("getUserByUserId failed...", e);
		}
		return null;
	}
}
