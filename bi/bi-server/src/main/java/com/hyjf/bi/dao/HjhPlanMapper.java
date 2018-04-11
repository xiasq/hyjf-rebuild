package com.hyjf.bi.dao;

import com.hyjf.bi.pojo.HjhPlan;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiasq
 * @version HjhPlanMapper, v0.1 2018/1/26 13:58
 */
public interface HjhPlanMapper extends BaseMapper<HjhPlan> {

	HjhPlan selectByPlanNid(@Param("planNid") String planNid);

}
