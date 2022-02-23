package com.xufeifan.study.dataType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author DZRABDemo
 * @version 1.0.0
 * @ClassName TestAnnotation
 * @Description TODO
 * @createTime 2022年02月23日 11:40:00
 */

//public interface abstract annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestAnnotation {

}
