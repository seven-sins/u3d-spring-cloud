package com.u3d.sys.server.mapper.impl;

import org.springframework.stereotype.Repository;

import com.u3d.common.base.impl.BaseMapperImpl;
import com.u3d.po.sys.User;
import com.u3d.sys.server.mapper.UserMapper;

/**
 * 用户mapper
 * @author seven sins
 * 2018年12月3日 下午1:26:41
 */
@Repository
public class UserMapperImpl extends BaseMapperImpl<User> implements UserMapper {

	public UserMapperImpl() {
		super.setNs("com.u3d.sys.mapper.UserMapper");
	}
}
