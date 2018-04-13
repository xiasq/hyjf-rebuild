package com.hyjf.bs.service.impl;

import com.hyjf.bs.dao.mapper.auto.GatewayApiConfigMapper;
import com.hyjf.bs.dao.model.auto.GatewayApiConfig;
import com.hyjf.bs.dao.model.auto.GatewayApiConfigExample;
import com.hyjf.bs.service.GatewayConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiasq
 * @version GatewayConfigServiceImpl, v0.1 2018/4/13 14:30
 */

@Service
public class GatewayConfigServiceImpl implements GatewayConfigService {
	@Autowired
	private GatewayApiConfigMapper gatewayApiConfigMapper;

	@Override
	public List<GatewayApiConfig> findGatewayConfigs() {
		return gatewayApiConfigMapper.selectByExample(new GatewayApiConfigExample());
	}
}
