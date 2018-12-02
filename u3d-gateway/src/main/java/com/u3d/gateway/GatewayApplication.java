package com.u3d.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
  *   网关服务
 * @author seven sins 
 * 2018年12月2日 下午7:21:15
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
