package javaCase.demo0327.AnnotationBasic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 描述需要执行的类名和方法名
* */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface caseProperties {
    String className();
    String methodName();
}
