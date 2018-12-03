package com.u3d.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.u3d.common.config.springutils.SpringUtil;

/**
 * spring容器
 * @author seven sins
 * 2018年12月3日 下午12:24:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Inherited
@Import({ EnableSpringUtil.SpringUtilImportSelector.class })
public @interface EnableSpringUtil {

	static class SpringUtilImportSelector implements ImportSelector {

		@Override
		public String[] selectImports(AnnotationMetadata importingClassMetadata) {
			return new String[] { SpringUtil.class.getName() };
		}
	}
}
