package com.hyjf.iam.constants;

import com.hyjf.common.constants.ErrorCode;

/**
 * @author xiasq
 * @version LoginError, v0.1 2018/1/21 22:26
 */
public enum LoginError implements ErrorCode {

	USER_LOGIN_FAILURE("denglu_0003", "您输入的手机号或密码有误，请重新输入"),
    USER_LOGIN_ERR_TIMES_LIMT("denglu_0006", "输入错误次数超过限制，请明天再试"),
    USER_LOGIN_FAILURE_PASSWORD_5("denglu_0010", "您输入的手机号或密码有误，请重新输入"),
    USER_LOGIN_FAILURE_PASSWORD_4("denglu_0011", "您输入的手机号或密码有误，请重新输入"),
    USER_LOGIN_FAILURE_PASSWORD_3("denglu_0012", "您输入的手机号或密码有误，请重新输入"),
    USER_LOGIN_FAILURE_PASSWORD_2("denglu_0013", "您输入的手机号或密码有误，请重新输入"),
    USER_LOGIN_FAILURE_PASSWORD_1("denglu_0014", "您输入的手机号或密码有误，请重新输入"),;

	private String errCode;
	private String message;

	LoginError(String errCode, String message) {
		this.errCode = errCode;
		this.message = message;
	}

	@Override
	public String getErrCode() {
		return errCode;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
