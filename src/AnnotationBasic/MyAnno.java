package javaCase.demo0327.AnnotationBasic;

import java.lang.annotation.*;

/*
javac xxx.java 编译
* javap xxx.class 反编译
注解的本质就是一个接口 public interface MyAnno extends Annotation
      但是其中的抽象方法又称为属性
* */
@Target(value= {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//可以作用于类，方法，变量
@Retention(RetentionPolicy.RUNTIME) //当前注解会保留到class字节码文件中，并被JVM读取到
@Documented
@Inherited
public @interface MyAnno {
   /* public abstract String show();
    int show1();
    String[] show2();
    Person per();
    MyAnno2 ma();*/
    int age() default 18;
    String name();
}

/*本质：一个接口 public interface MyAnno extends Annotation
 *       属性：接口中可以定义的抽象方法，可以省略(public abstract) String a();
 *           1. 要求：属性返回值类型只能是基本数据类型、字符串、枚举、注解、以上类型的数组
 *           2. 使用：注解使用时需要给属性赋值
 *                   @MyAnno(name="zhangsan",per=Person.p1,anno2=@Myanno2,
 *                           strs={"aa","vv"},strs="ss")
 *
 *               定义属性时使用default关键字就可以不需要赋值
 *               如果属性只有一个需要赋值，且属性名叫value，可以直接定义值
 *               数组赋值需要用{}，如果数组中只有一个值，{}可以省略
 *
 *       元注解：
 *           @Target 注解能作用的位置
 *                   TYPE 类  METHOD 方法 FIELD 变量
 *           @Retention 描述被保留的阶段
 *               @Retention(RetentionPolicy.RUNTIME) 当前注解会保留到class字节码文件中，并被JVM读取到
 *               @Retention(RetentionPolicy.CLASS) 当前注解会保留到class字节码文件中，不被JVM读取到
 *               @Retention(RetentionPolicy.SOURCE) 当前注解不会保留到class字节码文件中
 *           @Documented 描述是否被抽取到api文档中
 *           @Inherited 描述是否被子类继承
 * */