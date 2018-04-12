package com.hyjf.iam.service;

/**
 * @author xiasq
 * @version SmsService, v0.1 2018/4/12 17:32
 */
public interface SmsService {
    int save(String mobile, String verificationType, String verificationCode, String platform, Integer status);
}
