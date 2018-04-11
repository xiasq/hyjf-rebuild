package com.hyjf.cs.bi.service.impl;

import com.hyjf.bi.response.HjhPlanResponse;
import com.hyjf.bi.vo.HjhPlanVO;
import com.hyjf.cs.bi.service.BiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiasq
 * @version BiServiceImpl, v0.1 2018/1/26 11:46
 */
@Service
public class BiServiceImpl implements BiService {
	private static final Logger logger = LoggerFactory.getLogger(BiServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public HjhPlanVO getHjhPlanByPlanNid(String planNid) {

		HjhPlanResponse response = null;
		try {
			response = restTemplate.getForEntity("http://BI/bi/plan/findByPlanNid/" + planNid, HjhPlanResponse.class)
					.getBody();
			if (response != null)
				return response.getResult();
		} catch (RestClientException e) {
			logger.error("getHjhPlanByPlanNid failed...", e);
		}
		return null;
	}
}
