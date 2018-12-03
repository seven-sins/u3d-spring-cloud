package com.u3d.sys.server.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.u3d.common.base.impl.BaseServiceImpl;
import com.u3d.po.sys.User;
import com.u3d.sys.server.mapper.UserMapper;
import com.u3d.sys.server.service.UserService;

/**
 * 用户Service
 * @author seven sins
 * 2018年12月3日 下午1:38:46
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Resource
	public void setBaseMapper(UserMapper userMapper) {
		this.baseMapper = userMapper;
	}
}
