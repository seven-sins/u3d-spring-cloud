package com.u3d.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.u3d.common.config.mybatis.DruidConfiguration;
import com.u3d.common.config.mybatis.MyBatisConfig;

/**
 * 引入数据库配置
 * @author seven sins
 * 2018年12月3日 下午12:19:33
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Inherited
@Import({ EnableDatabase.DatabaseImportSelector.class })
public @interface EnableDatabase {

	static class DatabaseImportSelector implements ImportSelector {

		@Override
		public String[] selectImports(AnnotationMetadata importingClassMetadata) {
			return new String[] { DruidConfiguration.class.getName(), MyBatisConfig.class.getName() };
		}
	}
}
