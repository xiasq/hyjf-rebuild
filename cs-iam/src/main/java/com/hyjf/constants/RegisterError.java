package com.hyjf.constants;

/**
 * @author xiasq
 * @version RegisterError, v0.1 2018/4/11 9:43
 */
public enum RegisterError implements ErrorCode {
	REGISTER_ERROR("1", "注册失败");

	private String errCode;
	private String message;

	RegisterError(String errCode, String message) {
		this.errCode = errCode;
		this.message = message;
	}

	@Override
	public String getErrCode() {
		return null;
	}

	@Override
	public String getMessage() {
		return null;
	}
}
