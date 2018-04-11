package com.hyjf.iam.service.impl;

import com.hyjf.com.request.UserRequest;
import com.hyjf.com.vo.UserVO;
import com.hyjf.iam.exception.ServiceException;
import com.hyjf.iam.pojo.User;
import com.hyjf.iam.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyjf.iam.dao.UserMapper;

/**
 * @author xiasq
 * @version UserServiceImpl, v0.1 2018/1/21 22:42
 */

@Service
public class UserServiceImpl implements UserService{
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private UserMapper userMapper;

    @Override
    public User register(UserRequest userRequest) throws ServiceException {
        User user = new User();
        userMapper.insert(user);
        return user;
    }

    @Override
    public User findUserByUserId(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
