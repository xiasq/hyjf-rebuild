package com.hyjf.bi.web;

import com.alibaba.fastjson.JSONObject;
import com.hyjf.bi.pojo.HjhPlan;
import com.hyjf.bi.response.HjhPlanResponse;
import com.hyjf.bi.service.HjhPlanService;
import com.hyjf.bi.vo.HjhPlanVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiasq
 * @version HjhPlanController, v0.1 2018/1/26 14:08
 */

@RestController
@RequestMapping("/bi/plan")
public class HjhPlanController {
	private Logger logger = LoggerFactory.getLogger(HjhPlanController.class);

	@Autowired
	private HjhPlanService hjhPlanService;

	@RequestMapping("/findByPlanNid/{planNid}")
	public HjhPlanResponse findByPlanNid(@PathVariable String planNid) {
		HjhPlanResponse response = new HjhPlanResponse();
		HjhPlan hjhPlan = hjhPlanService.findByPlanNid(planNid);

		if (hjhPlan != null) {
			HjhPlanVO hjhPlanVO = new HjhPlanVO();
			BeanUtils.copyProperties(hjhPlan, hjhPlanVO);
			response.setResult(hjhPlanVO);
		}
		logger.info("response is : {}", JSONObject.toJSONString(response));
		return response;
	}

}
