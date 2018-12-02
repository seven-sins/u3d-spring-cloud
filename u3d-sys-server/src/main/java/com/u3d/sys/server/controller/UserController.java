package com.u3d.sys.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 * @author seven sins
 * 2018年12月2日 下午7:38:56
 */
@RestController
public class UserController {

	@GetMapping("/user")
	public Object find() {
		return 1;
	}
}
