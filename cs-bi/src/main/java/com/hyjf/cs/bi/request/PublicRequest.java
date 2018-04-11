package com.hyjf.cs.bi.request;

/**
 * @author xiasq
 * @version PublicRequest, v0.1 2018/1/26 11:10
 */
public class PublicRequest {

    private String sign;
    private String version;
    private String platform;
    private String token;
    private String order;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
