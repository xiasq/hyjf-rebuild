package com.hyjf.cs.iam.service.impl;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hyjf.com.request.RegisterUserRequest;
import com.hyjf.com.vo.UserVO;
import com.hyjf.common.exception.ReturnMessageException;
import com.hyjf.common.constants.CustomConstants;
import com.hyjf.cs.iam.service.IamService;
import com.hyjf.cs.iam.service.UserService;
import com.hyjf.cs.iam.util.GetDate;
import com.hyjf.cs.iam.util.Validator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyjf.cs.iam.constants.RegisterError;
import com.hyjf.cs.iam.vo.RegisterVO;

/**
 * @author xiasq
 * @version UserServiceImpl, v0.1 2018/4/11 9:34
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private IamService iamService;

	/**
	 * 1. 必要参数检查 2. 注册 3. 注册后处理
	 * 
	 * @param registerVO
	 * @throws ReturnMessageException
	 */
	@Override
	public UserVO register(RegisterVO registerVO) throws ReturnMessageException {

		this.checkParam(registerVO);

		RegisterUserRequest request = new RegisterUserRequest();
		BeanUtils.copyProperties(registerVO, request);
		UserVO userVO = iamService.register(request);
		if (userVO == null)
			throw new ReturnMessageException(RegisterError.REGISTER_ERROR);

		this.afterRegisterHandle(userVO);

		return userVO;
	}

	@Override
	public boolean existUser(String mobile) {
		UserVO userVO = iamService.findUserByMobile(mobile);
		return userVO == null ? false : true;
	}

	private void checkParam(RegisterVO registerVO) {
		if (registerVO == null)
			throw new ReturnMessageException(RegisterError.REGISTER_ERROR);

		String mobile = registerVO.getMobilephone();
		if (Validator.isNull(mobile))
			throw new ReturnMessageException(RegisterError.MOBILE_IS_NOT_NULL_ERROR);

		String smscode = registerVO.getSmscode();
		if (Validator.isNull(smscode))
			throw new ReturnMessageException(RegisterError.SMSCODE_IS_NOT_NULL_ERROR);

		String password = registerVO.getPassword();
		if (Validator.isNull(password))
			throw new ReturnMessageException(RegisterError.PASSWORD_IS_NOT_NULL_ERROR);

		if (!Validator.isMobile(mobile)) {
			throw new ReturnMessageException(RegisterError.MOBILE_IS_NOT_REAL_ERROR);
		} else {
			if (existUser(mobile)) {
				throw new ReturnMessageException(RegisterError.MOBILE_EXISTS_ERROR);
			}
		}
		if (password.length() < 6 || password.length() > 16) {
			throw new ReturnMessageException(RegisterError.PASSWORD_LENGTH_ERROR);
		}

		boolean hasNumber = false;
		for (int i = 0; i < password.length(); i++) {
			if (Validator.isNumber(password.substring(i, i + 1))) {
				hasNumber = true;
				break;
			}
		}
		if (!hasNumber) {
			throw new ReturnMessageException(RegisterError.PASSWORD_NO_NUMBER_ERROR);
		}
		String regEx = "^[a-zA-Z0-9]+$";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(password);
		if (!m.matches()) {
			throw new ReturnMessageException(RegisterError.PASSWORD_FORMAT_ERROR);
		}

		String verificationType = CustomConstants.PARAM_TPL_ZHUCE;
		int cnt = iamService.updateCheckMobileCode(mobile, smscode, verificationType, CustomConstants.CLIENT_PC,
				CustomConstants.CKCODE_YIYAN, CustomConstants.CKCODE_USED);
		if (cnt == 0) {
			throw new ReturnMessageException(RegisterError.SMSCODE_INVALID_ERROR);
		}

		String reffer = registerVO.getReffer();
		if (isNotBlank(reffer) && iamService.countUserByRecommendName(reffer) <= 0) {
			throw new ReturnMessageException(RegisterError.REFFER_INVALID_ERROR);
		}
	}

	private void afterRegisterHandle(UserVO userVO) {
		int userId = userVO.getUserId();

		int timestamp = GetDate.getMyTimeInMillis();
		// todo
		// String useridStr = TreeDESUtils.getEncrypt(String.valueOf(timestamp),
		// String.valueOf(userId));
		// ret.put("connection", useridStr);
		// ret.put("timestamp", timestamp);
		// ret.put("userid", userid);
		// ret.put("couponSendCount", 0);
		// ret.put(UserRegistDefine.STATUS, UserRegistDefine.STATUS_TRUE);
		// ret.put(UserRegistDefine.INFO, "注册成功");
		// try {
		// WebViewUser webUser = loginService.getWebViewUserByUserId(userid);
		// WebUtils.sessionLogin(request, response, webUser);
		// } catch (Exception e) {
		// logger
		// LogUtil.errorLog(UserRegistDefine.THIS_CLASS,
		// UserRegistDefine.INIT_REGIST_ACTION, "用户不存在，有可能读写数据库不同步", e);
		// }

		// 投之家用户注册送券活动
		// String activityIdTzj = CustomConstants.REGIST_TZJ_ACTIVITY_ID;
		// // 活动有效期校验
		// String resultActivityTzj =
		// couponCheckUtil.checkActivityIfAvailable(activityIdTzj);
		// if (StringUtils.isEmpty(resultActivityTzj)) {
		// Users user = loginService.getUsers(userid);
		// // 投之家用户额外发两张加息券
		// if(StringUtils.isNotEmpty(user.getReferrerUserName()) &&
		// user.getReferrerUserName().equals("touzhijia")){
		// CommonParamBean paramBean = new CommonParamBean();
		// paramBean.setUserId(String.valueOf(userid));
		// paramBean.setCouponSource(2);
		// paramBean.setCouponCode("PJ2958703");
		// paramBean.setSendCount(2);
		// paramBean.setActivityId(Integer.parseInt(activityIdTzj));
		// paramBean.setRemark("投之家用户注册送加息券");
		// paramBean.setSendFlg(0);
		// // 发放两张加息券
		// CommonSoaUtils.sendUserCouponNoRet(paramBean);
		//
		// }
		//
		// }

		// add by zhangjinpeng 注册送188元新手红包 start
		// 发券成功
		// 发送短信通知
		// String activityId = CustomConstants.REGIST_888_ACTIVITY_ID;
		// // 活动有效期校验
		// String resultActivity = couponCheckUtil.checkActivityIfAvailable(activityId);
		// if (StringUtils.isEmpty(resultActivity)) {
		// try {
		// sendCoupon(userid);
		// } catch (Exception e) {
		// LogUtil.errorLog(this.getClass().getName(), "regist", "注册发放888红包失败", e);
		// }
		// // 发送短信通知
		// sendSmsCoupon(userid,mobile);
		// ret.put("couponSendCount", 8);
		//
		// }

	}
}
