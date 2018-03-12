package com.lps.service;

import java.util.List;

import com.lps.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {

	/**
	 * 保存一个实体，null的属性不会保存，会使用数据库默认值
	 * @param t
	 */
	void add(T t);
	
	/**
	 * 根据主键更新属性不为null的值
	 * @param t
	 */
	void update(T t);
	
	/**
	 * 根据实体属性作为条件进行删除，查询条件使用等号
	 * @param t
	 */
	void delete(T t);
	
	/**
	 * 根据实体中的属性值进行查询，查询条件使用等号
	 * @param t
	 * @return
	 */
	List<T> selectByObj(T t);
	
	/**
	 * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
	 * @param i
	 * @return
	 */
	T selectById(Integer i);
}
