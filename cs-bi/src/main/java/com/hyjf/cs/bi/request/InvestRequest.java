package com.hyjf.cs.bi.request;

/**
 * @author xiasq
 * @version InvestRequest, v0.1 2018/1/26 11:12
 */
public class InvestRequest {
    private String money;
    private String couponId;
    private String borrowNid;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getBorrowNid() {
        return borrowNid;
    }

    public void setBorrowNid(String borrowNid) {
        this.borrowNid = borrowNid;
    }
}
