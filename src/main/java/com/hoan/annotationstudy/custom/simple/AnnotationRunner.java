package com.hoan.annotationstudy.custom.simple;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyService service = new MyService();

        // MyService의 모든 메서드 탐색
        for (Method method : MyService.class.getDeclaredMethods()) {
            // @LogExecutionTime 애노테이션이 붙은 메서드만 실행
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.currentTimeMillis();

                // 메서드 실행
                method.invoke(service);

                long end = System.currentTimeMillis();
                LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
                System.out.println(annotation.value() + " 실행 시간: " + (end - start) + "ms");
                System.out.println("----------------------------------");
            }
        }



    }
}
