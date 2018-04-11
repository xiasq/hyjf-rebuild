package com.hyjf.iam.service;

import com.hyjf.com.request.UserRequest;
import com.hyjf.com.vo.UserVO;
import com.hyjf.iam.exception.ServiceException;
import com.hyjf.iam.pojo.User;

/**
 * @author xiasq
 * @version UserService, v0.1 2018/1/21 22:42
 */
public interface UserService {
    User register(UserRequest userRequest) throws ServiceException;

    User findUserByUserId(int userId);
}
