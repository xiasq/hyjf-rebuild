package com.hyjf.cs.bi.util;

import java.text.DecimalFormat;

/**
 * @author xiasq
 * @version CustomConstants, v0.1 2018/1/30 9:11
 */
public class CustomConstants {

    /** 通讯状态key */
    public static final String APP_STATUS = "status";

    /** 通讯状态-成功 value */
    public static final String APP_STATUS_SUCCESS = "0";

    /** 通讯状态-失败 val */
    public static final String APP_STATUS_FAIL = "1";

    /** 通讯状态描述key */
    public static final String APP_STATUS_DESC = "statusDesc";

    /** 通讯状态描述 */
    public static final String APP_STATUS_DESC_SUCCESS = "成功";

    /** 通讯状态描述 */
    public static final String APP_STATUS_DESC_FAIL = "失败";

    /** 通讯请求url key */
    public static final String APP_REQUEST = "request";

    /** 投资页面的阈值 - 目前固定1000元 */
    public static final String TENDER_THRESHOLD = "1000";

    /** version=1.1.0 */
    public static final String APP_VERSION_NUM = "1.1.0";

    /** 页面展示钱格式化 */
    public static DecimalFormat DF_FOR_VIEW_V1 = new DecimalFormat("########0.00");

    /** 页面展示钱格式化 */
    public static DecimalFormat DF_FOR_VIEW = new DecimalFormat("#,##0.00");

    /** 页面展示金额格式化（四位小数） */
    public static DecimalFormat DF_FOR_VIEW_SPEED = new DecimalFormat("#,##0.0000");

    /** 还款类型 */
    // 等额本息
    public static final String BORROW_STYLE_MONTH = "month";

    // 等额本金
    public static final String BORROW_STYLE_PRINCIPAL = "principal";

    // 按月计息，到期还本还息
    public static final String BORROW_STYLE_END = "end";

    // 按天计息，到期还本还息
    public static final String BORROW_STYLE_ENDDAY = "endday";

    // 先息后本
    public static final String BORROW_STYLE_ENDMONTH = "endmonth";
}
