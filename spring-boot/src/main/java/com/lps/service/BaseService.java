package com.lps.service;

import java.util.List;

import com.lps.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {

	void add(T t);
	
	void update(T t);
	
	void delete(T t);
	
	List<T> selectByObj(T t);
	
	T selectById(String id);
}
