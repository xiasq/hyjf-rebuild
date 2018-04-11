package com.hyjf.bi.service;

import com.hyjf.bi.pojo.HjhPlan;

/**
 * @author xiasq
 * @version HjhPlanService, v0.1 2018/1/26 14:10
 */
public interface HjhPlanService {
    HjhPlan findByPlanNid(String planNid);
}
