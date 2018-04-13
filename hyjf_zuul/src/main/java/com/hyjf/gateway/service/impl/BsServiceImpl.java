package com.hyjf.gateway.service.impl;

import com.hyjf.bs.response.GatewayApiConfigResponse;
import com.hyjf.bs.vo.GatewayApiConfigVO;
import com.hyjf.gateway.service.BsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author xiasq
 * @version BsServiceImpl, v0.1 2018/4/13 9:54
 */
@Service
public class BsServiceImpl implements BsService {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<GatewayApiConfigVO> findGatewayConfigs() {
		GatewayApiConfigResponse response = restTemplate
				.getForEntity("http://BS/bs/config/findGatewayConfigs", GatewayApiConfigResponse.class).getBody();
		return response.getResultList();
	}
}
