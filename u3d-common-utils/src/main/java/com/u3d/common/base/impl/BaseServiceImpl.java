package com.u3d.common.base.impl;

import java.io.Serializable;
import java.util.List;

import com.u3d.common.base.BaseMapper;
import com.u3d.common.base.BaseService;
import com.u3d.common.exception.CommonException;

/**
 * BaseService默认实现类
 * @author seven sins
 * 2018年12月3日 下午12:58:41
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	protected BaseMapper<T> baseMapper;
	
	public void setBaseMapper(BaseMapper<T> baseMapper) {
		this.baseMapper = baseMapper;
	}
	
	@Override
	public List<T> find(T entity) {
		this.checkBaseMapper();
		
		return baseMapper.find(entity);
	}

	@Override
	public int count(T entity) {
		this.checkBaseMapper();
		
		return baseMapper.count(entity);
	}

	@Override
	public T get(Serializable id) {
		this.checkBaseMapper();
		
		return baseMapper.get(id);
	}

	@Override
	public void insert(T entity) {
		this.checkBaseMapper();
		
		baseMapper.insert(entity);
	}

	@Override
	public void update(T entity) {
		this.checkBaseMapper();
		
		baseMapper.update(entity);
	}

	@Override
	public void deleteById(Serializable id) {
		this.checkBaseMapper();
		
		baseMapper.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		this.checkBaseMapper();
		
		baseMapper.delete(ids);
	}
	
	private void checkBaseMapper() {
		if(baseMapper == null) {
			throw new CommonException("baseMapper不能为空");
		}
	}

}
