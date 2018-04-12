package com.hyjf.cs.iam.service.impl;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hyjf.common.util.GetCode;
import com.hyjf.cs.iam.service.CouponService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hyjf.com.request.RegisterUserRequest;
import com.hyjf.com.vo.UserVO;
import com.hyjf.common.constants.CustomConstants;
import com.hyjf.common.exception.MQException;
import com.hyjf.common.exception.ReturnMessageException;
import com.hyjf.common.session.WebViewUser;
import com.hyjf.common.util.GetDate;
import com.hyjf.common.util.TreeDESUtils;
import com.hyjf.common.util.Validator;
import com.hyjf.cs.iam.constants.RegisterError;
import com.hyjf.cs.iam.mq.CouponProducer;
import com.hyjf.cs.iam.mq.Producer;
import com.hyjf.cs.iam.service.IamService;
import com.hyjf.cs.iam.service.UserService;
import com.hyjf.cs.iam.vo.RegisterVO;

/**
 * @author xiasq
 * @version UserServiceImpl, v0.1 2018/4/11 9:34
 */

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private IamService iamService;

	@Autowired
	private CouponService couponService;
	@Autowired
	private CouponProducer couponProducer;

	@Value("${rocketMQ.topic.coupon}")
	private String couponTopic;
	@Value("${rocketMQ.tag.defaultTag}")
	private String defaultTag;
	@Value("${hyjf.activity.regist.tzj.id}")
	private String activityIdTzj;
	@Value("${hyjf.activity.888.id}")
	private String activityId;

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

	@Override
	public WebViewUser getWebViewUserByUserId(Integer userId) {
		WebViewUser result = new WebViewUser();
		//
		// UsersExample usersExample = new UsersExample();
		// usersExample.createCriteria().andUserIdEqualTo(userId);
		// List<Users> usersList = usersMapper.selectByExample(usersExample);
		// Users user = usersList.get(0);
		//
		// result.setUserId(user.getUserId());
		// result.setUsername(user.getUsername());
		// if (StringUtils.isNotBlank(user.getMobile())) {
		// result.setMobile(user.getMobile());
		// }
		// if (StringUtils.isNotBlank(user.getIconurl())) {
		// String imghost =
		// UploadFileUtils.getDoPath(PropUtils.getSystem("file.domain.head.url"));
		// imghost = imghost.substring(0, imghost.length() - 1);//
		// http://cdn.huiyingdai.com/
		//
		// String fileUploadTempPath =
		// UploadFileUtils.getDoPath(PropUtils.getSystem("file.upload.head.path"));
		// if(StringUtils.isNotEmpty(user.getIconurl())){
		// result.setIconurl(imghost + fileUploadTempPath + user.getIconurl());
		// }
		// }
		// if (StringUtils.isNotBlank(user.getEmail())) {
		// result.setEmail(user.getEmail());
		// }
		// if (user.getOpenAccount() != null) {
		// if (user.getOpenAccount().intValue() == 1) {
		// result.setOpenAccount(true);
		// } else {
		// result.setOpenAccount(false);
		// }
		// }
		// if (user.getBankOpenAccount() != null) {
		// if (user.getBankOpenAccount() == 1) {
		// result.setBankOpenAccount(true);
		// } else {
		// result.setBankOpenAccount(false);
		// }
		// }
		// result.setRechargeSms(user.getRechargeSms());
		// result.setWithdrawSms(user.getWithdrawSms());
		// result.setInvestSms(user.getInvestSms());
		// result.setRecieveSms(user.getRecieveSms());
		// result.setIsSetPassword(user.getIsSetPassword());
		// result.setIsEvaluationFlag(user.getIsEvaluationFlag());
		// result.setIsSmtp(user.getIsSmtp());
		// result.setUserType(user.getUserType());
		// result.setPaymentAuthStatus(user.getPaymentAuthStatus());
		//
		// UsersInfoExample usersInfoExample = new UsersInfoExample();
		// usersInfoExample.createCriteria().andUserIdEqualTo(userId);
		// List<UsersInfo> usersInfoList =
		// usersInfoMapper.selectByExample(usersInfoExample);
		// if (usersInfoList != null && usersInfoList.size() > 0 &&
		// usersInfoList.get(0).getSex() != null) {
		// result.setSex(usersInfoList.get(0).getSex());
		// if (StringUtils.isNotBlank(usersInfoList.get(0).getNickname())) {
		// result.setNickname(usersInfoList.get(0).getNickname());
		// }
		// if (StringUtils.isNotBlank(usersInfoList.get(0).getTruename())) {
		// result.setTruename(usersInfoList.get(0).getTruename());
		// }
		// if (StringUtils.isNotBlank(usersInfoList.get(0).getIdcard())) {
		// result.setIdcard(usersInfoList.get(0).getIdcard());
		// }
		// result.setBorrowerType(usersInfoList.get(0).getBorrowerType());
		// }
		// result.setRoleId(usersInfoList.get(0).getRoleId() + "");
		//
		// AccountChinapnrExample chinapnrExample = new AccountChinapnrExample();
		// chinapnrExample.createCriteria().andUserIdEqualTo(userId);
		// List<AccountChinapnr> chinapnrList =
		// accountChinapnrMapper.selectByExample(chinapnrExample);
		// if (chinapnrList != null && chinapnrList.size() > 0) {
		// result.setChinapnrUsrid(chinapnrList.get(0).getChinapnrUsrid());
		// result.setChinapnrUsrcustid(chinapnrList.get(0).getChinapnrUsrcustid());
		// }
		//
		// BankOpenAccount bankOpenAccount = this.getBankOpenAccount(userId);
		// if (bankOpenAccount != null &&
		// StringUtils.isNotEmpty(bankOpenAccount.getAccount())) {
		// if (result.isBankOpenAccount()) {
		// result.setBankAccount(bankOpenAccount.getAccount());
		// }
		// }
		// // 用户紧急联系人
		// UsersContractExample usersContractExample = new UsersContractExample();
		// usersContractExample.createCriteria().andUserIdEqualTo(userId);
		// List<UsersContract> UsersContractList =
		// usersContractMapper.selectByExample(usersContractExample);
		// if (UsersContractList != null && UsersContractList.size() > 0) {
		// result.setUsersContract(UsersContractList.get(0));
		// }
		return result;
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

		String useridStr = TreeDESUtils.getEncrypt(String.valueOf(timestamp), String.valueOf(userId));
		// todo 用户登陆之后缓存
		// ret.put("connection", useridStr);
		// ret.put("timestamp", timestamp);
		// ret.put("userid", userid);
		// ret.put("couponSendCount", 0);
		// ret.put(UserRegistDefine.STATUS, UserRegistDefine.STATUS_TRUE);
		// ret.put(UserRegistDefine.INFO, "注册成功");

		// try {
		// WebViewUser webUser = this.getWebViewUserByUserId(userId);
		// WebUtils.sessionLogin(request, response, webUser);
		// } catch (Exception e) {
		// logger
		// LogUtil.errorLog(UserRegistDefine.THIS_CLASS,
		// UserRegistDefine.INIT_REGIST_ACTION, "用户不存在，有可能读写数据库不同步", e);
		// }

		// 投之家用户注册送券活动
		// 活动有效期校验
		if (!couponService.checkActivityIfAvailable(activityIdTzj)) {
			// 投之家用户额外发两张加息券
			if (StringUtils.isNotEmpty(userVO.getReferrerUserName())
					&& userVO.getReferrerUserName().equals("touzhijia")) {
				// 发放两张加息券
				JSONObject json = new JSONObject();
				json.put("userId", userId);
				json.put("couponSource", 2);
				json.put("couponCode", "PJ2958703");
				json.put("sendCount", 2);
				json.put("activityId", Integer.parseInt(activityIdTzj));
				json.put("remark", "投之家用户注册送加息券");
				json.put("sendFlg", 0);
				try {
					couponProducer.messageSend(new Producer.MassageContent(couponTopic, defaultTag, "coupon_" + userId,
							JSON.toJSONBytes(json)));
				} catch (MQException e) {
					logger.error("注册送券失败....userId is :" + userId, e);
				}

			}

			// 发券成功
			// 发送短信通知
			// 活动有效期校验
			if (!couponService.checkActivityIfAvailable(activityId)) {
				try {
					JSONObject params = new JSONObject();
					params.put("mqMsgId", GetCode.getRandomCode(10));
					params.put("userId", String.valueOf(userId));
					params.put("sendFlg", "11");
					couponProducer.messageSend(new Producer.MassageContent(couponTopic, defaultTag, "coupon_" + userId,
							JSON.toJSONBytes(params)));
				} catch (Exception e) {
					logger.error("注册发放888红包失败...", e);
				}

				// 发送短信通知
				// sendSmsCoupon(userid, mobile);
				// ret.put("couponSendCount", 8);
			}
		}
	}
}
