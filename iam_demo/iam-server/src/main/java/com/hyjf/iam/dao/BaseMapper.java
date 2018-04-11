package com.hyjf.iam.dao;

/**
 * @author xiasq
 * @version BaseMapper, v0.1 2018/1/21 22:28
 */
public interface BaseMapper<T> {

	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
