package com.hyjf.bi.service.impl;

import com.hyjf.bi.dao.HjhPlanMapper;
import com.hyjf.bi.pojo.HjhPlan;
import com.hyjf.bi.service.HjhPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiasq
 * @version HjhPlanServiceImpl, v0.1 2018/1/26 14:10
 */
@Service
public class HjhPlanServiceImpl implements HjhPlanService{

    @Autowired
    private HjhPlanMapper hjhPlanMapper;

    @Override
    public HjhPlan findByPlanNid(String planNid) {
        return hjhPlanMapper.selectByPlanNid(planNid);
    }
}
