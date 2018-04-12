package com.hyjf.cs.iam.service;

import com.hyjf.com.vo.UserVO;
import com.hyjf.common.exception.ReturnMessageException;
import com.hyjf.common.session.WebViewUser;
import com.hyjf.cs.iam.vo.RegisterVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiasq
 * @version UserService, v0.1 2018/4/11 9:34
 */
public interface UserService {
	UserVO register(RegisterVO registerVO) throws ReturnMessageException;

	boolean existUser(String mobile);

	WebViewUser getWebViewUserByUserId(Integer userId);

	void sendSmsCode(String validCodeType, String mobile, HttpServletRequest request);
}
