package com.lps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lps.entity.BaseEntity;
import com.lps.mapper.TkMapper;

public abstract class BaseServiceImpl<T extends BaseEntity,D extends TkMapper<T>> {

	@Autowired
	protected D d;
	
	public void add(T t) {
		d.insertSelective(t);
	}

	public void update(T t) {
		d.updateByPrimaryKeySelective(t);
	}

	public void delete(T t) {
		d.delete(t);
	}

	public List<T> selectByObj(T t) {
		return d.select(t);
	}

	public T selectById(Integer id) {
		return d.selectByPrimaryKey(id);
	}
	
}
