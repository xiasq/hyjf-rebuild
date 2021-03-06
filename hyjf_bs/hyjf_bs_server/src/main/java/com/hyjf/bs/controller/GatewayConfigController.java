package com.hyjf.bs.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyjf.bs.dao.model.auto.GatewayApiConfig;
import com.hyjf.bs.response.GatewayApiConfigResponse;
import com.hyjf.bs.service.GatewayConfigService;
import com.hyjf.bs.vo.GatewayApiConfigVO;

/**
 * @author xiasq
 * @version GatewayConfigController, v0.1 2018/4/13 11:17
 */

@RestController
@RequestMapping("/bs/config")
public class GatewayConfigController {
	private Logger logger = LoggerFactory.getLogger(GatewayConfigController.class);

	@Autowired
	private GatewayConfigService gatewayConfigService;

	/**
	 * 从db中查询
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/findGatewayConfigs")
	public GatewayApiConfigResponse findGatewayConfigs() {
		logger.info("findGatewayConfigs start...");
		GatewayApiConfigResponse response = new GatewayApiConfigResponse();

		List<GatewayApiConfigVO> configVOs = null;
		List<GatewayApiConfig> configs = gatewayConfigService.findGatewayConfigs();
		if (!CollectionUtils.isEmpty(configs)) {
			configVOs = new ArrayList<>(configs.size());
			GatewayApiConfigVO vo = null;
			for (GatewayApiConfig config : configs) {
				vo = new GatewayApiConfigVO();
				BeanUtils.copyProperties(config, vo);
				vo.setId(String.valueOf(config.getId()));
				configVOs.add(vo);
			}
		}
		response.setResultList(configVOs);
		return response;
	}
}
