package javaCase.demo0327.AnnotationBasic;
/*
* 注释：说明程序，编译检查（@override)，编写文档（生成doc),代码分析（使用反射）
*
*
* 预定义注解：
*       1. @override
*       2. @Deprecated 已不适用，但是仍能够使用
*       3. @SuppressWarnings("all") 压制所有警告 用于类名之上
*
* 自定义注解:
*   格式：元注解
*         public @interface 注解名{}
*   注解: MyAnno
*       本质：一个接口 public interface MyAnno extends Annotation
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
*
* 案例：
*       1.用注解获取配置文件 CaseReflectionProperties
*       2.用注解写一个测试框架TestCheck
* 小结：
*       1.大多数时候是使用注解
*       2.注解给谁用？编译器，给解析程序用
*       3.不是程序的一部分，可以理解为注解就是一个标签

* */
@MyAnno(name="zhangwang")
public class DemoAnnotation {
}
