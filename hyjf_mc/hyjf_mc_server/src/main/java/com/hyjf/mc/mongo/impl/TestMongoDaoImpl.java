package com.hyjf.mc.mongo.impl;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.hyjf.mc.bean.DemoBean;
import com.hyjf.mc.mongo.BaseMongoDao;
import com.hyjf.mc.mongo.TestMongoDao;

/**
 * @author xiasq
 * @version TestMongoDaoImpl, v0.1 2018/4/18 15:25
 */

@Repository
public class TestMongoDaoImpl extends BaseMongoDao implements TestMongoDao {
	@Override
	public String getNameByUserId(int userId) {
		Query query = new Query();
		Criteria criteria = Criteria.where("userId").is(userId);
		query.addCriteria(criteria);
		DemoBean demoBean = mongoTemplate.findOne(query, DemoBean.class);
		return demoBean.getName();
	}

	@Override
	public int save(DemoBean demoBean) {
		mongoTemplate.insert(demoBean);
		return 1;
	}
}
