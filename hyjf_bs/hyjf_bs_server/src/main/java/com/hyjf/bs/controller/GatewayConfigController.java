package com.hyjf.bs.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyjf.bs.response.GatewayApiConfigResponse;
import com.hyjf.bs.vo.GatewayApiConfigVO;

/**
 * @author xiasq
 * @version GatewayConfigController, v0.1 2018/4/13 11:17
 */

@RestController
@RequestMapping("/config")
public class GatewayConfigController {

    /**
     * 从db中查询
     * @param request
     * @return
     */
	@RequestMapping(value = "/findGatewayConfigs")
	public GatewayApiConfigResponse findGatewayConfigs() {
		GatewayApiConfigResponse response = new GatewayApiConfigResponse();
		GatewayApiConfigVO vo = new GatewayApiConfigVO();
        vo.setPath("/api/*");
        vo.setEnabled(true);
        vo.setRetryable(false);
        vo.setStripPrefix(1);
        vo.setServiceId("CS-IAM");
		response.setResultList(Arrays.asList(vo));
		return response;
	}
}
