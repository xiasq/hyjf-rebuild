package com.hyjf.cs.bi.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiasq
 * @version CommonUtils, v0.1 2017/11/11 11:51
 */
public class CommonUtils {
	private final static Logger logger = LoggerFactory.getLogger(CommonUtils.class);

	/**
	 * 提供对象属性null转""方法，目前只支持String的属性
	 * 
	 * @param obj
	 */
	public static Object convertNullToEmptyString(Object obj) {
		if (obj == null)
			return obj;
		// 获取对象属性
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			// 跳过静态属性
			String mod = Modifier.toString(field.getModifiers());
			if (mod.indexOf("static") != -1)
				continue;

			// 得到属性的类名
			String className = field.getType().getSimpleName();
			if (className.equalsIgnoreCase("String")) {
				try {
					field.setAccessible(true); // 设置些属性是可以访问的
					Object val = field.get(obj);
					// System.out.println(field.getName() + "=" + (String) val);

					if (val == null) {
						field.set(obj, "");
					}
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return obj;
	}

	/**
	 * 提供对象属性null转""方法，目前只支持String的属性
	 * 
	 * @param colls
	 * @return
	 */
	public static Collection convertNullToEmptyString(Collection colls) {
		for (Object coll : colls) {
			convertNullToEmptyString(coll);
		}
		return colls;
	}

	/**
	 * 根据还款类型获取还款单位
	 * 
	 * @param repayStyle
	 * @return
	 */
	public static String getPeriodUnitByRepayStyle(String repayStyle) {

		if (StringUtils.isEmpty(repayStyle))
			return StringUtils.EMPTY;

		String periodUnit;
		if (CustomConstants.BORROW_STYLE_ENDDAY.equals(repayStyle)) {
			periodUnit = "天";
		} else {
			periodUnit = "个月";
		}
		return periodUnit;
	}

	/**
	 * 判断是否是分期还款 true:是分期
	 * 
	 * @param repayStyle
	 * @return
	 */
	public static boolean isStageRepay(String repayStyle) {
		if (StringUtils.isEmpty(repayStyle))
			return false;
		if (Arrays.asList(CustomConstants.BORROW_STYLE_ENDDAY, CustomConstants.BORROW_STYLE_END).contains(repayStyle))
			return false;
		return true;
	}

	/**
	 * 适应app返回格式，数据不能是null,转换为指定格式
	 * 
	 * @param obj
	 * @param val
	 * @return
	 */
	public static Object nvl(Object obj, String val) {
		if (obj == null) {
			return val;
		}
		return obj;
	}


	/**
	 * 手机号验证
	 *
	 * @param str
	 * @return 验证通过返回true
	 */
	public static boolean isMobile(String str) {
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
		m = p.matcher(str);
		b = m.matches();
		return b;
	}

	/***
	 * 金额格式化 10，000.00
	 * 
	 * @param version
	 * @param amount
	 * @return
	 */
	public static String formatAmount(String version, BigDecimal amount) {

		// 金额显示格式
		DecimalFormat moneyFormat = null;
		// 判断选择哪种金融样式
		if (StringUtils.isNotBlank(version) && version.contains(CustomConstants.APP_VERSION_NUM)) {
			moneyFormat = CustomConstants.DF_FOR_VIEW_V1;
		} else {
			moneyFormat = CustomConstants.DF_FOR_VIEW;
		}

		String formatAmount;
		try {
			formatAmount = moneyFormat.format(amount);
		} catch (Exception e) {
			logger.error("金额格式化失败...", e);
			formatAmount = String.valueOf(amount);
		}
		return formatAmount;
	}

	/**
	 * 支持不带版本的格式化
	 * @param amount
	 * @return
	 */
	public static String formatAmount(BigDecimal amount) {
		return formatAmount("", amount);
	}


	/***
	 * 金额格式化 10，000.00
	 *
	 * @param version
	 * @param money
	 * @return
	 */
	public static String formatAmount(String version, String money) {
		if (StringUtils.isNotEmpty(money)) {
			BigDecimal amount = BigDecimal.ZERO;
			try {
				amount = new BigDecimal(money);
			} catch (Exception e) {
				logger.info("money is : {}", money);
				logger.error("金额转换失败...", e);
				return money;
			}
			return formatAmount(version, amount);
		}
		return "0.00";
	}

	/**
	 * 支持不带版本的格式化
	 * @param money
	 * @return
	 */
	public static String formatAmount(String money) {
		return formatAmount("", money);
	}
}
