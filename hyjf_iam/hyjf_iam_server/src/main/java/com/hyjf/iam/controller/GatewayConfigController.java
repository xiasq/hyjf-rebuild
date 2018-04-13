package com.hyjf.iam.controller;

import javax.validation.Valid;

import com.hyjf.com.vo.GatewayApiConfigVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyjf.com.request.SmsCodeRequest;
import com.hyjf.com.response.GatewayApiConfigResponse;

import java.util.Arrays;

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
	public GatewayApiConfigResponse saveSmsCode(@RequestBody @Valid SmsCodeRequest request) {
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
