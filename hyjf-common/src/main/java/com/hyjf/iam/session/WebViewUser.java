/*
 * Copyright(c) 2012-2016 JD Pharma.Ltd. All Rights Reserved.
 */
package com.hyjf.iam.session;

import java.io.Serializable;

/**
 * WEB页面展示用户实体
 * 
 * @author renxingchen
 * @version hyjf 1.0
 * @since hyjf 1.0 2016年4月6日
 * @see 下午3:52:25
 */
public class WebViewUser implements Serializable {

    /**
     * 此处为属性说明
     */
    private static final long serialVersionUID = 6315004857843065077L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getOpenAccount() {
        return openAccount;
    }

    public void setOpenAccount(Boolean openAccount) {
        this.openAccount = openAccount;
    }

    public String getChinapnrUsrid() {
        return chinapnrUsrid;
    }

    public void setChinapnrUsrid(String chinapnrUsrid) {
        this.chinapnrUsrid = chinapnrUsrid;
    }

    public Long getChinapnrUsrcustid() {
        return chinapnrUsrcustid;
    }

    public void setChinapnrUsrcustid(Long chinapnrUsrcustid) {
        this.chinapnrUsrcustid = chinapnrUsrcustid;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

//    public UsersContract getUsersContract() {
//		return usersContract;
//	}
//
//	public void setUsersContract(UsersContract usersContract) {
//		this.usersContract = usersContract;
//	}

	public Integer getRechargeSms() {
		return rechargeSms;
	}

	public void setRechargeSms(Integer rechargeSms) {
		this.rechargeSms = rechargeSms;
	}

	public Integer getWithdrawSms() {
		return withdrawSms;
	}

	public void setWithdrawSms(Integer withdrawSms) {
		this.withdrawSms = withdrawSms;
	}

	public Integer getInvestSms() {
		return investSms;
	}

	public void setInvestSms(Integer investSms) {
		this.investSms = investSms;
	}

	public Integer getRecieveSms() {
		return recieveSms;
	}

	public void setRecieveSms(Integer recieveSms) {
		this.recieveSms = recieveSms;
	}

	private Integer userId;

    private String username = "";

    private String mobile = "";

    private String iconurl = "";

    private Integer sex = 0;

    /**
     * 昵称
     */
    private String nickname = "";

    /**
     * 真实姓名
     */
    private String truename = "";

    /**
     * 身份证
     */
    private String idcard = "";

    /**
     * email
     */
    private String email = "";

    /**
     * 是否开户,0未开户1已开户
     */
    private Boolean openAccount = false;

    /**
     * 汇付账号,咱平台的zsc_xxxxx
     */
    private String chinapnrUsrid = "";

    /**
     * 汇付账号,汇付平台的6000xxxxx
     */
    private Long chinapnrUsrcustid;

    /**
     * 用户类型，标识是借款用户还是投资用户
     */
    private String roleId;
    /**
     * 用户紧急联系人
     */
   // private UsersContract usersContract;
    /**
     * 充值成功短信 0发送1不发送
     */
    private Integer rechargeSms;
    /**
     * 提现成功短线 0发送1不发送
     */
    private Integer withdrawSms;
    /**
     * 投资成功短信 0发送1不发送
     */
    private Integer investSms;
    /**
     * 回收成功短信 0发送1不发送
     */
    private Integer recieveSms;

}
