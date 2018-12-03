package com.u3d.common.base.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.u3d.common.base.BaseMapper;

public class BaseMapperImpl<T> extends SqlSessionDaoSupport implements BaseMapper<T> {

	private String ns;
	
	@Override
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	@Override
	public List<T> find(T entity) {
		return this.getSqlSession().selectList(ns + ".find", entity);
	}

	@Override
	public int count(T entity) {
		return this.getSqlSession().selectOne(ns + ".count", entity);
	}

	@Override
	public T get(Serializable id) {
		return this.getSqlSession().selectOne(ns + ".get", id);
	}

	@Override
	public void insert(T entity) {
		this.getSqlSession().insert(ns + ".insert", entity);
	}

	@Override
	public void update(T entity) {
		this.getSqlSession().update(ns + ".update", entity);
	}

	@Override
	public void deleteById(Serializable id) {
		this.getSqlSession().delete(ns + ".deleteById", id);
	}

	@Override
	public void delete(Serializable[] ids) {
		this.getSqlSession().delete(ns + ".delete", ids);
	}
}
