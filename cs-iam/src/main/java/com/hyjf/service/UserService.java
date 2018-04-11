package com.hyjf.service;

import com.hyjf.com.vo.UserVO;
import com.hyjf.exception.ReturnMessageException;
import com.hyjf.vo.RegisterVO;

/**
 * @author xiasq
 * @version UserService, v0.1 2018/4/11 9:34
 */
public interface UserService {
	UserVO register(RegisterVO registerVO) throws ReturnMessageException;

	boolean existUser(String mobile);
}
