package com.hyjf.gateway.service;

import java.util.List;

/**
 * @author xiasq
 * @version IamService, v0.1 2018/4/13 9:54
 */
public interface IamService {
    List<GatewayApiConfigVO> findGatewayConfigs();
}
