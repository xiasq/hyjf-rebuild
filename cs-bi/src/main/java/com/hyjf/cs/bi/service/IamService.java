package com.hyjf.cs.bi.service;

import com.hyjf.iam.vo.AccountVO;
import com.hyjf.iam.vo.UserVO;

/**
 * @author xiasq
 * @version IamService, v0.1 2018/1/26 11:05
 */
public interface IamService {
    UserVO getUserByUserId(int userId);

    AccountVO getAccountByUserId(int userId);
}
