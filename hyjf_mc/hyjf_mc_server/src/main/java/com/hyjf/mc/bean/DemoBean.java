package com.hyjf.mc.bean;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author xiasq
 * @version DemoBean, v0.1 2018/4/18 15:48
 */

@Document(collection = "t_demo")
public class DemoBean {

	@Indexed
	private int userId;

	private Date createTime;

	private String name;

    public DemoBean(int userId, String name) {
    	this.userId = userId;
    	this.name = name;
    	this.createTime = new Date();
    }

    public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
