package javaCase.demo0327.FunctinalInterface;

import java.util.function.Consumer;

/*
常用函数式接口二：
    Consumer接口 消费型接口
    void accept()方法接收传入数据，自定义处理方法,消费一个任意类型的数据
    Consumer<T> andThen() 默认方法连接两个Consumer接口 连续消费

    无返回值
* */
public class DemoConsumer {
    public static void continualConsumer(String s, Consumer<String> cons1, Consumer<String> cons2){
        cons1.andThen(cons2).accept(s);//对s先进性消费1处理再进行消费2处理
    }

    public static void main(String[] args) {
        continualConsumer("Hello",
                (s)->{
                    System.out.println(new StringBuffer(s).reverse().toString());
                },(s)->{
                    System.out.println(s.toLowerCase());
                });
    }
}
