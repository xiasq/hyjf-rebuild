package com.hyjf.mc.mongo;

import com.hyjf.mc.bean.DemoBean;

/**
 * @author xiasq
 * @version TestMongoDao, v0.1 2018/4/18 15:24
 */
public interface TestMongoDao {
    String getNameByUserId(int userId);

    int save(DemoBean demoBean);
}
