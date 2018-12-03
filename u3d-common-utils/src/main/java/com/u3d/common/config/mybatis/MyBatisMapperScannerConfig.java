package com.u3d.common.config.mybatis;

/**
 * MyBatis扫描配置
 * 
 * @author seven sins
 * @date 2018年5月8日 下午10:53:49
 * 
 * @Configuration
 * @AutoConfigureAfter({ MyBatisConfig.class })
 */
public class MyBatisMapperScannerConfig {

	// 可在模块启动类上使用@MapperScan("com.lonecpp.redis.mapper")
	// @Value("${mybatis.params.mapperLocation}")
	// String mapperLocation;

	// @Bean
	// public MapperScannerConfigurer mapperScannerConfigurer() {
	// MapperScannerConfigurer mapperScannerConfigurer = new
	// MapperScannerConfigurer();
	// mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
	// mapperScannerConfigurer.setBasePackage("com.lonecpp.redis.mapper"); // mapper
	// package、xml namespace
	//
	// return mapperScannerConfigurer;
	// }
}
