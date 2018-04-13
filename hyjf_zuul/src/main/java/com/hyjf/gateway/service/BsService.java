package com.hyjf.gateway.service;

import com.hyjf.bs.vo.GatewayApiConfigVO;

import java.util.List;

/**
 * @author xiasq
 * @version BsService, v0.1 2018/4/13 9:54
 */
public interface BsService {
    List<GatewayApiConfigVO> findGatewayConfigs();
}
