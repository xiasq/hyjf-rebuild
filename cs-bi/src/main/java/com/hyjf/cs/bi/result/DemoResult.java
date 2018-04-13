/*
 * Copyright(c) 2012-2016 JD Pharma.Ltd. All Rights Reserved.
 */
package com.hyjf.cs.bi.result;

import com.hyjf.bi.vo.HjhPlanVO;
import com.hyjf.iam.vo.UserVO;

public class DemoResult extends BaseResultBean {

	public DemoResult(String request) {
		super(request);
	}

	private HjhPlanVO hjhPlanVO;

	private UserVO userVO;

	public HjhPlanVO getHjhPlanVO() {
		return hjhPlanVO;
	}

	public void setHjhPlanVO(HjhPlanVO hjhPlanVO) {
		this.hjhPlanVO = hjhPlanVO;
	}

	public UserVO getUserVO() {
		return userVO;
	}

	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
}
