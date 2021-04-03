package javaCase.demo0327.ReflectBasic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 反射：框架设计的灵魂，将类的各个组成部分封装为其他对象
*   框架：半成品软件，再框架基础上进行软件开发，可以简化代码
*
* java代码在计算机中的三个阶段：
*   1.Source源代码阶段：javac编译后得到字节码文件（还在硬盘上）
*   2.Class类对象阶段：类加载器加载字节码文件到内存，创建类对象
*               Class Class 用来描述字节码文件的共性对象 有成员变量Field[]、
*               构造方法Constructor[]、成员方法Method[]
*   3.Runtime运行阶段：实例创建阶段
*
* 反射好处：
*    1.可以在程序运行过程中，操纵这些对象：eg提示
*    2.可以解耦，提高程序可扩展性
*
* 获取字节码三种方式：
*   1.Class.forName("全类名") 将字节码加载进内存
*   2.类名.class 通过类名属性获得
*   3.对象.getClass() 定义在object类中
*
* 使用Class对象的方法：
*   获取功能 成员变量 setAccessible(true);
*              构造方法
*              成员方法
*              类名
*       setAccessible(true)暴力反射
* */
public class DemoReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        get();

    }
    public static void construct() throws ClassNotFoundException {
        Class cls = Class.forName("javaCase.demo0327.ReflectBasic.Person");
        System.out.println(cls);

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
        System.out.println(cls==cls2);
        System.out.println(cls3==cls2);
        /*同一个字节码文件（.class)在一次程序运行中只会加载一次，不论创建多少次实例，Class对象
         * 都是一样的，不同的类的class对象是不一样的*/
    }
    /*
    * */
    public static void get() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<Person> cls = Person.class;

        /*
        * 成员变量
        * */
        Field[] fields = cls.getFields(); //只能获取public变量

        Person p = new Person();
        Field field = cls.getDeclaredField("name");//获取所有成员变量

        field.setAccessible(true);//java.lang.IllegalAccessException 忽略访问权限报错 暴力反射
        System.out.println(field.get(p));  //null
        field.set(p,"你好");
        System.out.println(p);    //Person{name='你好', age=0}
        System.out.println("============");

        /*
        * 构造方法
        * */
        Constructor<Person> constructor = cls.getConstructor(String.class, int.class);
        System.out.println(constructor);//public javaCase.demo0327.RejectionBasic.Person(java.lang.String,int)

        Person p1 = constructor.newInstance("张三", 23);//用类对象创建对象
        System.out.println(p1);//Person{name='张三', age=23}

        Person person = cls.newInstance();//空参构造

        /*
        * 成员方法
        * */
        Method eat = cls.getMethod("eat",String.class);
        Person p2 = new Person();
        eat.invoke(p,"food"); //eating....food

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName()); //所有方法，包括object的方法
        }

        System.out.println(cls.getName()); //javaCase.demo0327.RejectionBasic.Person 类名


    }
}
