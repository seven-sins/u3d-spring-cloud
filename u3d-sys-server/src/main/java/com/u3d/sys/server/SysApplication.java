package com.u3d.sys.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.u3d.common.annotation.EnableDatabase;

/**
 * 系统服务
 * @author seven sins
 * 2018年12月2日 下午7:37:42
 */
@EnableDatabase
@SpringBootApplication
public class SysApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SysApplication.class, args);
	}
}
