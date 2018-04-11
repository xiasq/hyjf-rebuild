package com.hyjf.cs.bi.service;

import com.hyjf.bi.vo.HjhPlanVO;

/**
 * @author xiasq
 * @version BiService, v0.1 2018/1/26 11:46
 */
public interface BiService {
    HjhPlanVO getHjhPlanByPlanNid(String planNid);
}
