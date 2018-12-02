package com.u3d.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 * @author seven sins
 * 2018年12月2日 下午3:31:11
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
