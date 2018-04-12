package com.hyjf.iam.service.impl;

import com.hyjf.common.constants.CustomConstants;
import com.hyjf.common.security.utils.MD5;
import com.hyjf.common.util.GetDate;
import com.hyjf.iam.dao.mapper.auto.SmsCodeMapper;
import com.hyjf.iam.dao.model.auto.SmsCode;
import com.hyjf.iam.dao.model.auto.SmsCodeExample;
import com.hyjf.iam.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiasq
 * @version SmsServiceImpl, v0.1 2018/4/12 17:32
 */
@Service
public class SmsServiceImpl implements SmsService {
	@Autowired
	private SmsCodeMapper smsCodeMapper;

	@Override
	public int save(String mobile, String verificationType, String verificationCode, String platform, Integer status) {
		// 删除其他验证码
		SmsCodeExample example = new SmsCodeExample();
		SmsCodeExample.Criteria cra = example.createCriteria();
		cra.andMobileEqualTo(mobile);
		List<Integer> statusList = new ArrayList<Integer>();
		statusList.add(CustomConstants.CKCODE_NEW);
		statusList.add(CustomConstants.CKCODE_YIYAN);
		cra.andStatusIn(statusList);
		List<SmsCode> codeList = smsCodeMapper.selectByExample(example);
		if (codeList != null && codeList.size() > 0) {
			for (SmsCode smsCode : codeList) {
				smsCode.setStatus(CustomConstants.CKCODE_FAILED);// 失效7
				smsCodeMapper.updateByPrimaryKey(smsCode);
			}
		}
		// 保存新验证码到数据库
		SmsCode smsCode = new SmsCode();
		smsCode.setCheckfor(MD5.toMD5Code(mobile + verificationCode + verificationType + platform));
		smsCode.setMobile(mobile);
		smsCode.setCheckcode(verificationCode);
		smsCode.setPosttime(GetDate.getMyTimeInMillis());
		smsCode.setStatus(status);
		smsCode.setUserId(0);
		return smsCodeMapper.insertSelective(smsCode);
	}

	@Override
	public int updateCheckMobileCode(String mobile, String verificationCode, String verificationType, String platform, Integer status, Integer updateStatus) {
		int time = GetDate.getNowTime10();
		int timeAfter = time - 900;// 15分钟有效 900
		SmsCodeExample example = new SmsCodeExample();
		SmsCodeExample.Criteria cra = example.createCriteria();
		cra.andPosttimeGreaterThanOrEqualTo(timeAfter);
		cra.andPosttimeLessThanOrEqualTo(time);
		cra.andMobileEqualTo(mobile);
		cra.andCheckcodeEqualTo(verificationCode);
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);//短信验证码状态,新验证码
		list.add(status);
		cra.andStatusIn(list);
		List<SmsCode> codeList = smsCodeMapper.selectByExample(example);
		if (codeList != null && codeList.size() > 0) {
			for (SmsCode smsCode : codeList) {
				if (smsCode.getCheckfor().equals(MD5.toMD5Code(mobile + verificationCode + verificationType + platform))) {
					smsCode.setStatus(updateStatus);// 已验8或已读9
					smsCodeMapper.updateByPrimaryKey(smsCode);
					return 1;
				}
			}
			return 0;
		} else {
			return 0;
		}
	}

	@Override
	public int saveSmsCode(String mobile, String verificationCode, String verificationType, Integer status, String platform) {
		// 使之前的验证码无效
		SmsCodeExample example = new SmsCodeExample();
		SmsCodeExample.Criteria cra = example.createCriteria();
		cra.andMobileEqualTo(mobile);
		List<Integer> statusList = new ArrayList<Integer>();
		statusList.add(0);//短信验证码状态,新验证码
		statusList.add(8);//短信验证码状态,已验
		cra.andStatusIn(statusList);
		List<SmsCode> codeList = smsCodeMapper.selectByExample(example);
		if (codeList != null && codeList.size() > 0) {
			for (SmsCode smsCode : codeList) {
				// if (smsCode.getCheckfor().equals(MD5.toMD5Code(mobile +
				// verificationCode + verificationType + platform))) {
				smsCode.setStatus(7);// 失效7
				smsCodeMapper.updateByPrimaryKey(smsCode);
				// }
			}
		}
		// 保存新验证码到数据库
		SmsCode smsCode = new SmsCode();
		smsCode.setCheckfor(MD5.toMD5Code(mobile + verificationCode + verificationType + platform));
		smsCode.setMobile(mobile);
		smsCode.setCheckcode(verificationCode);
		smsCode.setPosttime(GetDate.getMyTimeInMillis());
		smsCode.setStatus(status);
		smsCode.setUserId(0);
		return smsCodeMapper.insertSelective(smsCode);
	}
}
