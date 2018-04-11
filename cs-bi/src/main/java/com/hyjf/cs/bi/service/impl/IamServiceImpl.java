package com.hyjf.cs.bi.service.impl;

import com.hyjf.com.response.AccountResponse;
import com.hyjf.com.response.UserResponse;
import com.hyjf.com.vo.AccountVO;
import com.hyjf.com.vo.UserVO;
import com.hyjf.cs.bi.service.IamService;
import io.undertow.security.idm.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiasq
 * @version IamServiceImpl, v0.1 2018/1/26 11:05
 */

@Service
public class IamServiceImpl implements IamService{
    private static Logger logger = LoggerFactory.getLogger(IamServiceImpl.class);
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserVO getUserByUserId(int userId) {
        UserResponse response = null;
        try {
            response = restTemplate.getForEntity("http://IAM/iam/user/findUserByUserId/" + userId, UserResponse.class)
                    .getBody();
            if (response != null)
                return response.getResult();
        } catch (RestClientException e) {
            logger.error("getUserByUserId failed...", e);
        }
        return null;
    }

    @Override
    public AccountVO getAccountByUserId(int userId) {
        AccountResponse response = null;
        try {
            response = restTemplate.getForEntity("http://IAM/iam/user/findAccountByUserId/" + userId, AccountResponse.class)
                    .getBody();
            if (response != null)
                return response.getResult();
        } catch (RestClientException e) {
            logger.error("getAccountByUserId failed...", e);
        }
        return null;
    }
}
