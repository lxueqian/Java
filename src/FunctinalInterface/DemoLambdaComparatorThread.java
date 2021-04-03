package javaCase.demo0327.FunctinalInterface;

import java.util.Arrays;
import java.util.Comparator;

/*
* 函数式接口：有且仅有一个抽象方法的接口，当然可以有其他方法（默认、静态、私有）
* 函数式编程体现就是Lambda,函数式接口就是适用于Lambda使用的接口
* 格式：
*       修饰符 interface 接口名称{
*           public abstract 返回值类型 方法名称（可选参数）;
*       }
* @FunctionalInterface注解
*
* 语法糖:
*   定义：简化程序开发，但是不会提供实质性的功能改造
*   注意： 1.语法糖在编译阶段就会被还原成简单的基础语法结构，这个过程就是解语法糖
*         2. 主要有泛型、变长参数、条件编译、自动拆装箱、内部类等
*               枚举，断言，枚举和字符串对switch支持，try语句中定义和关闭资源等
*
* 函数式接口：一般作为方法的参数和返回值类型使用
* lambda:当函数式接口作为方法参数传递时可以使用lambda表达式传递参数
* */
public class DemoLambdaComparatorThread {
    public static void main(String[] args) {
//        show(new MyFunctionalInterfaceImpl()); 传入一个接口实现类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口方法");
            }
        });

        show(()-> System.out.println("使用lambda表达式直接重写接口方法"));

        startThread(()-> System.out.println(Thread.currentThread().getName()+"-->"+"线程启动"));

        String[] arr = {"ss","ssss","ffffff","ddd"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));

    }
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    //函数式接口作为方法参数，调用时可以传入一个lambda表达式
    public static void startThread(Runnable run){
        new Thread(run).start(); //Runnable是函数式接口
    }


    //函数式接口作为方法返回值类型，可以直接返回一个lambda表达式
    public static Comparator<String> getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };
//        return (String o1, String o2)->{return o2.length()-o1.length();};
        return (o1, o2)->o2.length()-o1.length();
    }

}
