package javaCase.demo0327.FunctinalInterface;

import java.util.function.Function;

/*
* Java.util.Function<T,R>接口用来根据一个类型数据得到另一个类型的数据
* 抽象方法：
*   R apply(T t)
* 默认方法：
*   func1 andThen(func2).apply(T t)
*
* 有返回值：可以连续改变
* */
public class DemoFunctionApplyAndThen {
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String str = "123";
        change(str,(s)->{
            return Integer.parseInt(s)+10; //字符串转换为整数+10
        },(i)->{
            return i+""; //整数编程字符串
        });
        change(str,(s)->Integer.parseInt(s)+10,(i)->i+"");
    }
}

