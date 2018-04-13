package com.hyjf.gateway.service.impl;

import com.hyjf.gateway.service.IamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author xiasq
 * @version IamServiceImpl, v0.1 2018/4/13 9:54
 */
@Service
public class IamServiceImpl implements IamService {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<GatewayApiConfigVO> findGatewayConfigs() {
		GatewayApiConfigResponse response = restTemplate
				.getForEntity("http://IAM/iam/config/findGatewayConfigs", GatewayApiConfigResponse.class).getBody();
		return response.getResultList();
	}
}
