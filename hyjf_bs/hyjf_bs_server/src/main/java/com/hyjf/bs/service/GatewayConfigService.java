package com.hyjf.bs.service;

import com.hyjf.bs.dao.model.auto.GatewayApiConfig;

import java.util.List;

/**
 * @author xiasq
 * @version GatewayConfigService, v0.1 2018/4/13 14:29
 */
public interface GatewayConfigService {

    List<GatewayApiConfig> findGatewayConfigs();
}
