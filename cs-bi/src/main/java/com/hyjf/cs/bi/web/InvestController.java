package com.hyjf.cs.bi.web;

import com.alibaba.fastjson.JSONObject;
import com.hyjf.bi.vo.HjhPlanVO;
import com.hyjf.com.vo.AccountVO;
import com.hyjf.com.vo.UserVO;
import com.hyjf.cs.bi.request.InvestRequest;
import com.hyjf.cs.bi.request.PublicRequest;
import com.hyjf.cs.bi.result.InvestInfoResultVo;
import com.hyjf.cs.bi.service.BiService;
import com.hyjf.cs.bi.service.IamService;
import com.hyjf.cs.bi.util.CommonUtils;
import com.hyjf.cs.bi.util.CustomConstants;
import io.undertow.security.idm.Account;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import static com.sun.imageio.plugins.jpeg.JPEG.version;

/**
 * @author xiasq
 * @version InvestController, v0.1 2018/1/26 11:04
 */
@RestController
@RequestMapping("/user/invest")
public class InvestController {
	private Logger logger = LoggerFactory.getLogger(InvestController.class);

	@Autowired
	private BiService biService;

	@Autowired
	private IamService iamService;

	/**
	 * 获取投资信息
	 * @param investRequest
	 * @return
	 */
	@RequestMapping("/getInvestInfo")
	public InvestInfoResultVo getInvestInfo(@RequestHeader String sign,
											@RequestHeader String token,
											@RequestBody InvestRequest investRequest) {
		InvestInfoResultVo investInfoResultVo = new InvestInfoResultVo("");
		String borrowNid = investRequest.getBorrowNid();
		if (StringUtils.isBlank(borrowNid) && borrowNid.length() < 3) {
			investInfoResultVo.setStatusDesc("参数错误....");
			return investInfoResultVo;
		}
		String investType = borrowNid.substring(0, 3);

		int userId = this.parseUserId(sign);

		// 1.计划加入
		if ("HJH".equals(investType)) {
			investInfoResultVo = this.doGetHjhInvestInfo(investInfoResultVo, investRequest, userId);
		} else if ("HZR".equals(investType)) { // 2.债转投资
			investInfoResultVo = this.doGetHzrInvestInfo(investInfoResultVo, investRequest, userId);
		} else { // 3.散标投资
			investInfoResultVo = this.doGetNomalInvestInfo(investInfoResultVo, investRequest, userId);
		}

		// 协议赋值
		this.setProtocolsToResultVO(investInfoResultVo, investType, borrowNid);

		return investInfoResultVo;
	}

	/**
	 * 获取计划加入信息
	 * @param resultVo
	 * @param investRequest
	 * @return
	 */
	private InvestInfoResultVo doGetHjhInvestInfo(InvestInfoResultVo resultVo, InvestRequest investRequest, int userId) {
		logger.info("汇计划获取投资数据, planNid is " + investRequest.getBorrowNid());

		// 投资金额
		String money = investRequest.getMoney();
		String planNid = investRequest.getBorrowNid();
		String couponId = investRequest.getCouponId();

		if (StringUtils.isNotBlank(money) && new BigDecimal(money).compareTo(BigDecimal.ZERO) > 0) {
			resultVo.setButtonWord("确认加入" + CommonUtils.formatAmount(money) + "元");
		}

		// 查询计划信息 传入borrowNid
		resultVo.setStandardValues(CustomConstants.TENDER_THRESHOLD);
		// 根据项目标号获取相应的计划信息
		HjhPlanVO hjhPlanVO = biService.getHjhPlanByPlanNid(planNid);
		resultVo.setBorrowApr(hjhPlanVO.getExpectApr() + "%");
		resultVo.setPaymentOfInterest("0" + "元");
		// 获取用户最优优惠券


	//	UserCouponConfigCustomize couponConfig = null;
		if (hjhPlanVO != null) {
			/**resultVo.setBorrowNid(planNid);
			// -设置 开放额度剩余金额
			String borrowAccountWait = "0";
			if (hjhPlanVO.getAvailableInvestAccount() != null) {
				borrowAccountWait = CommonUtils.formatAmount(hjhPlanVO.getAvailableInvestAccount());
			}
			borrowAccountWait = borrowAccountWait.replaceAll(",", "");
			resultVo.setBorrowAccountWait(borrowAccountWait); // 开放额度剩余金额
			String initMoney = "0";
			// -设置 最小投资金额(起投金额)-->计算最后一笔投资
			if (hjhPlanVO.getMinInvestment() != null) {
				initMoney = hjhPlanVO.getMinInvestment().intValue() + "";
			}
			resultVo.setInitMoney(initMoney);
			// -设置优惠券
			logger.info("HJH couponId is:{}, planNid is :{}", couponId, planNid);
			if (couponId == null || "".equals(couponId) || couponId.length() == 0) {
				// 不用获取最优优惠券了
				// couponConfig = planService.getUserOptimalCoupon(couponId, borrowNid, userId,
				// money, platform);
			} else {
				// 如果已经有了优惠券 判断优惠券是否可用
				JSONObject userCoupon = couponService.getHJHProjectUserCoupon(planNid, userId, money, platform);
				if (isHjhCouponAvailable(couponId, userCoupon)) {
					couponConfig = getCouponById(couponId);
				}
			}
			logger.info("优惠券信息couponConfig: {}", JSONObject.toJSONString(couponConfig));
			if ("-1".equals(couponId)) {
				couponConfig = null;
			}

			// 刚加载页面并且可投小于起投
			if ((StringUtils.isBlank(money) || money.equals("0")) && new BigDecimal(borrowAccountWait)
					.compareTo(new BigDecimal(planDetail.getDebtMinInvestment())) < 1) {
				money = new BigDecimal(borrowAccountWait).intValue() + "";
			}
			if (money.contains(",")) {
				money = money.replace(",", "");
			}

			BigDecimal earnings = new BigDecimal("0");
			// 计算收益
			if ((!StringUtils.isBlank(money) && Double.parseDouble(money) >= 0)) {
				// 这里有个坑，如果计划剩余可投小于用户投资金额，那么计算收益需要用计划剩余可投计算，不能使用用户投资金额计算收益
				logger.info("计划剩余可投: {}", borrowAccountWait);
				logger.info("用户投资金额: {}", money);
				if (new BigDecimal(borrowAccountWait).compareTo(new BigDecimal(money)) < 0) {
					logger.info("计划剩余可投小于用户投资金额,收益按照计划剩余可投计算...");
					earnings = planService.setProspectiveEarnings(resultVo, couponConfig, planNid, userId, platform,
							borrowAccountWait);
				} else {
					logger.info("计划剩余可投大于用户投资金额,收益按照用户投资金额计算...");
					earnings = planService.setProspectiveEarnings(resultVo, couponConfig, planNid, userId, platform,
							money);
				}
			}
			logger.info("本金投资计算出的收益是: {}", earnings);

			// 设置优惠券
			resultVo.setCapitalInterest("");
			resultVo.setConfirmCouponDescribe("未使用优惠券");
			resultVo.setRealAmount("");
			resultVo.setCouponType("");
			JSONObject counts = CommonSoaUtils.getUserCouponAvailableCount(planNid, userId, money, platform);
			String couponAvailableCount = "0";
			if (counts.containsKey("availableCouponListCount")) {
				couponAvailableCount = counts.getString("availableCouponListCount");
			}
			if (couponConfig != null) {
				if (couponConfig != null && couponConfig.getId() > 0 && couponConfig.getCouponType() == 1) {
					resultVo.setCouponDescribe("体验金: " + couponConfig.getCouponQuota() + "元");
					resultVo.setConfirmCouponDescribe("体验金: " + couponConfig.getCouponQuota() + "元");
					resultVo.setCouponType("体验金");
				}
				if (couponConfig != null && couponConfig.getId() > 0 && couponConfig.getCouponType() == 2) {
					resultVo.setCouponDescribe("加息券: " + couponConfig.getCouponQuota() + "%");
					resultVo.setConfirmCouponDescribe("加息券: " + couponConfig.getCouponQuota() + "%");
					resultVo.setCouponType("加息券");

				}
				if (couponConfig != null && couponConfig.getId() > 0 && couponConfig.getCouponType() == 3) {
					resultVo.setCouponDescribe("代金券: " + couponConfig.getCouponQuota() + "元");
					resultVo.setConfirmCouponDescribe("代金券: " + couponConfig.getCouponQuota() + "元");
					resultVo.setCouponType("代金券");
					resultVo.setRealAmount("实际投资 " + CommonUtils.formatAmount(version,
							new BigDecimal(money).add(couponConfig.getCouponQuota())) + "元");

				}
				resultVo.setCouponName(couponConfig.getCouponName());
				resultVo.setCouponQuota(couponConfig.getCouponQuota().toString());
				resultVo.setEndTime(couponConfig.getCouponAddTime() + "-" + couponConfig.getEndTime());
				resultVo.setIsThereCoupon("1");
				resultVo.setCouponId(couponConfig.getUserCouponId());
				resultVo.setIsUsedCoupon("1");

				logger.info("开始计算优惠券收益....");
				String calculateIncomeCapital = "";
				if (new BigDecimal(borrowAccountWait).compareTo(new BigDecimal(money)) < 0) {
					logger.info("同样，计划剩余可投小于用户投资金额,收益按照计划剩余可投计算...");
					calculateIncomeCapital = borrowAccountWait;
				} else {
					logger.info("同样，计划剩余可投大于用户投资金额,收益按照用户投资金额计算...");
					calculateIncomeCapital = money;
				}
				logger.info("优惠券金额按照{}计算....", calculateIncomeCapital);
				JSONObject couResult = CommonSoaUtils.getCouponInterest(couponConfig.getUserCouponId() + "", borrowNid,
						calculateIncomeCapital);
				logger.info("优惠券预期收益计算结果couResult: {}", couResult);

				resultVo.setCapitalInterest(couResult.getString("couponInterest") + "元");
				// 优惠券预期收益
				couponInterest = new BigDecimal(couResult.getString("couponInterest"));

				// 预期收益
				borrowInterest = earnings.add(couponInterest);

				// 备注
				resultVo.setDesc("预期年化利率:  " + hjhPlanVO.getExpectApr() + "%      预期收益:  " + borrowInterest + "元");
				resultVo.setProspectiveEarnings(CommonUtils.formatAmount(version, borrowInterest) + "元");
				resultVo.setInterest(CommonUtils.formatAmount(borrowInterest));
			} else {
				// 没有可用优惠券
				resultVo.setIsThereCoupon("0");
				resultVo.setCouponDescribe("暂无可用");
				resultVo.setCouponName("");
				resultVo.setCouponQuota("");
				resultVo.setEndTime("");
				resultVo.setCouponId("-1");

				JSONObject userCoupon = couponService.getHJHProjectUserCoupon(planNid, userId, money, platform);
				if (!"0".equals(userCoupon.getString("availableCouponListCount"))) {
					resultVo.setIsThereCoupon("1");
					resultVo.setCouponDescribe("请选择");
				} else if ("0".equals(userCoupon.getString("availableCouponListCount"))
						&& !"0".equals(userCoupon.getString("notAvailableCouponListCount"))) {
					resultVo.setIsThereCoupon("1");
					resultVo.setCouponDescribe("暂无可用");
				} else {
					resultVo.setIsThereCoupon("0");
					resultVo.setCouponDescribe("无可用");
				}

				resultVo.setDesc("预期年化利率: " + hjhPlanVO.getExpectApr() + "%      预期收益: " + earnings + "元");
				resultVo.setProspectiveEarnings(earnings + "元");
			}


			*/





			// 可用优惠券数量
			//resultVo.setCouponAvailableCount(couponAvailableCount);
			resultVo.setConfirmRealAmount("投资金额: " + CommonUtils.formatAmount(money) + "元");
			// -设置 用户余额
			AccountVO accountVO = iamService.getAccountByUserId(userId);
			BigDecimal balance = accountVO.getBankBalance();

			resultVo.setBalance(CommonUtils.formatAmount(balance));
			resultVo.setStatus(CustomConstants.APP_STATUS_SUCCESS);
			resultVo.setStatusDesc(CustomConstants.APP_STATUS_DESC_SUCCESS);
			// 起投金额
			resultVo.setInitMoney(hjhPlanVO.getMinInvestment().intValue() + "");
			// 递增金额
			resultVo.setIncreaseMoney(hjhPlanVO.getInvestmentIncrement().intValue() + "");
			resultVo.setInvestmentDescription(resultVo.getInitMoney() + "元起投," + resultVo.getIncreaseMoney() + "元递增");
			//resultVo.setBorrowAccountWait(CommonUtils.formatAmount(borrowAccountWait)); // 开放额度剩余金额
			BigDecimal tmpmoney = balance.subtract(hjhPlanVO.getMinInvestment())
					.divide(hjhPlanVO.getInvestmentIncrement(), 0, BigDecimal.ROUND_DOWN)
					.multiply(hjhPlanVO.getInvestmentIncrement()).add(hjhPlanVO.getMinInvestment());
			if (balance.subtract(hjhPlanVO.getMinInvestment()).compareTo(new BigDecimal("0")) < 0) {
				// 可用余额<起投金额 时 investAllMoney 传 -1
				// 全投金额
				resultVo.setInvestAllMoney("-1");
			} else {
				String borrowAccountWaitStr = resultVo.getBorrowAccountWait().replace(",", "");
				if (hjhPlanVO.getMaxInvestment().compareTo(new BigDecimal(borrowAccountWaitStr)) < 0) {
					if (balance.compareTo(hjhPlanVO.getMaxInvestment()) < 0) {
						resultVo.setInvestAllMoney(balance + "");
					} else {
						resultVo.setInvestAllMoney(hjhPlanVO.getMaxInvestment() + "");
					}
				} else if (tmpmoney.compareTo(new BigDecimal(borrowAccountWaitStr)) < 0) {
					// 全投金额
					if (balance.compareTo(tmpmoney) < 0) {
						resultVo.setInvestAllMoney(balance + "");
					} else {
						resultVo.setInvestAllMoney(tmpmoney + "");
					}
					resultVo.setInvestAllMoney(tmpmoney + "");
				} else {
					// 全投金额
					resultVo.setInvestAllMoney(resultVo.getBorrowAccountWait() + "");
				}
			}
			resultVo.setAnnotation("");
		} else {
			logger.info("=================HJH borrow is null! =============");
			resultVo.setStatusDesc(CustomConstants.APP_STATUS_DESC_FAIL);
		}

		// todo by xiashuqing 20180126
		return resultVo;
	}

	/**
	 * 获取承接债转的投资信息
	 * @param investInfoResultVo
	 * @param investRequest
	 * @return
	 */
	private InvestInfoResultVo doGetHzrInvestInfo(InvestInfoResultVo investInfoResultVo, InvestRequest investRequest, int userId) {
		// todo by xiashuqing 20180126
		return investInfoResultVo;
	}

	/**
	 * 获取散标的投资信息
	 * @param investInfoResultVo
	 * @param investRequest
	 * @return
	 */
	private InvestInfoResultVo doGetNomalInvestInfo(InvestInfoResultVo investInfoResultVo, InvestRequest investRequest, int userId) {
		logger.info("散标获取投资数据, borrowNid is " + investRequest.getBorrowNid());
		// todo by xiashuqing 20180126
		return investInfoResultVo;
	}

	/**
	 * 投资页协议列表返回
	 * @param investInfoResultVo
	 * @param investType
	 * @param borrowNid
	 */
	private void setProtocolsToResultVO(InvestInfoResultVo investInfoResultVo, String investType, String borrowNid) {
		// todo by xiashuqing 20180126
	}

	/**
	 * 解析userId
	 * @param sign
	 * @return
	 */
	private int parseUserId(String sign) {
		//todo by xiashuqing 20180126
		return 1163;
	}

}
