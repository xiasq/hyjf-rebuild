package com.hyjf.bs.dao.mapper.auto;

import com.hyjf.bs.dao.model.auto.GatewayApiConfig;
import com.hyjf.bs.dao.model.auto.GatewayApiConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatewayApiConfigMapper {
    int countByExample(GatewayApiConfigExample example);

    int deleteByExample(GatewayApiConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GatewayApiConfig record);

    int insertSelective(GatewayApiConfig record);

    List<GatewayApiConfig> selectByExample(GatewayApiConfigExample example);

    GatewayApiConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GatewayApiConfig record, @Param("example") GatewayApiConfigExample example);

    int updateByExample(@Param("record") GatewayApiConfig record, @Param("example") GatewayApiConfigExample example);

    int updateByPrimaryKeySelective(GatewayApiConfig record);

    int updateByPrimaryKey(GatewayApiConfig record);
}