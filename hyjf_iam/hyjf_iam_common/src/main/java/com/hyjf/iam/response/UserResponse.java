package com.hyjf.iam.response;

import com.hyjf.iam.vo.UserVO;

/**
 * @author xiasq
 * @version UserResponse, v0.1 2018/1/21 22:38
 */
public class UserResponse extends Response<UserVO> {

	public static final String USER_EXISTS = "100";
	public static final String USER_EXISTS_MSG = "用户已经存在";

}
