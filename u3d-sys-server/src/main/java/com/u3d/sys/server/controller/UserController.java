package com.u3d.sys.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.u3d.common.utils.Response;
import com.u3d.po.sys.User;
import com.u3d.sys.server.service.UserService;

/**
 * 用户控制器
 * @author seven sins
 * 2018年12月2日 下午7:38:56
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public Response<User> find() {
		return new Response<User>().list(userService.find(null));
	}
}
