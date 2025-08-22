package com.hoan.annotationstudy.custom.simple;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 이 애노테이션은 메서드에만 적용됨
@Target(ElementType.METHOD)
// 런타임에 유지되어 리플렉션으로 읽을 수 있음
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {
    String value() default "";
}


