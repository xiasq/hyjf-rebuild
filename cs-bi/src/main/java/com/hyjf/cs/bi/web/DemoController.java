package com.hyjf.cs.bi.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hyjf.bi.vo.HjhPlanVO;
import com.hyjf.com.vo.UserVO;
import com.hyjf.cs.bi.result.DemoResult;
import com.hyjf.cs.bi.service.BiService;
import com.hyjf.cs.bi.service.IamService;

/**
 * @author xiasq
 * @version DemoController, v0.1 2018/1/29 22:22
 */

@RestController
@RequestMapping("/user/demo")
public class DemoController {
	private Logger logger = LoggerFactory.getLogger(DemoController.class);

	@Autowired
	private BiService biService;

	@Autowired
	private IamService iamService;

	/**
	 * 一个调用原子服务的例子，以及组合服务提供什么功能
	 * 
	 * @return
	 */
	@RequestMapping("/getData")
	public DemoResult getInvestInfo() {
		DemoResult demoResult = new DemoResult("");
		HjhPlanVO hjhPlanVO = biService.getHjhPlanByPlanNid("HJH2017122011");
		logger.info("hjhPlanVO is : {}", JSONObject.toJSONString(hjhPlanVO));
		demoResult.setHjhPlanVO(hjhPlanVO);

		UserVO userVO = iamService.getUserByUserId(1163);
		logger.info("userVO is : {}", JSONObject.toJSONString(userVO));
		demoResult.setUserVO(userVO);
		return demoResult;
	}
}
