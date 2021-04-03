package javaCase.demo0327.StreamBasic;

import javaCase.demo0327.ArrayListPrint;

import java.net.ServerSocket;
import java.util.*;
import java.util.stream.Stream;

/*
拼接流式模型：建立一个生产线来生产产品，为了方便处理集合数据，和IO流不一样
流模型可以转化为另一个流模型
lambda延迟执行特性：只有当最后终结方法执行时整个模型生产线才会开始运行
Stream流是一个来自数据源的元素队列，不会存储元素而是按需计算(单列！！）
    1.获取流 java.util.stream.Stream<T> 不是函数式接口
         所有collection都可以通过.stream获取对应流
         Stream接口静态方法of()
    2.常用方法
        延迟方法：返回Stream接口自身类型的方法
        终结方法：count forEach
* */
public class Demo1Stream {
    public static void main(String[] args) {
        casePractice();
    }
    public static void construct(){
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();

        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream3 = entries.stream();

        Stream<Integer> stream4 = Stream.of(1,2,3,4,5);//数组变成Stream流
    }

    /*
    * forEach方法用来遍历流中的数据，是一个终结方法，遍历以后不能继续调用其他方法
    * void forEach(Consumer<? super T> action);
    *   接受一个Consumer接口（lambda表达式），会将每一个流元素交给函数处理
    * 用函数式接口二：
        Consumer接口 消费型接口
        void accept()方法接收传入数据，自定义处理方法,消费一个任意类型的数据
        Consumer<T> andThen() 默认方法连接两个Consumer接口 连续消费
    * */
    public static void method1(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach((Integer i)->{
            System.out.println(i);
        });
        stream.forEach((i)-> System.out.println(i));
    }
    /*
    * filter方法
    * Stream<T> filter(Predicate<? super T> p) 对stream流中的数据进行过滤
    *   接收lambda表达式（函数式接口），对数据进行过滤
    * Boolean test(source) 对source进行判断
    * */
    public static void method2(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<Integer> stream1 = stream.filter((i)->{return i>3;});
        stream1.forEach((i)-> System.out.println(i));
    }
    /*
    * Stream流属于管道流，只能被消费一次，第一个stream流调用完毕，数据会流转到下一个stream流上
    * */
    /*
    map方法
    * <R> Stream<R> map(Function<? super T,? extends R> mapper)
    *   接收一个Function函数式接口，将当前流中的T类型数据转化为R类型的流
      Function抽象方法：
    *   R apply(T t)
    */
    public static void method3(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<String> stream1 = stream.map((i)->i+"");
        stream1.forEach((s)-> System.out.println(s));
    }
    /*
    * count方法
    * long count() 统计Stream流中元素的个数 终结方法 不可以再继续调用
    * */
    public static void method4(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        long count = stream.count();
        System.out.println(count);
    }
    /*
    * limit方法
    * Stream<T> limit(long maxSize) 延迟方法 只是对流中的元素进行截取*/
    public static void method5(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<Integer> stream1 = stream.limit(3);
        stream1.forEach((i)-> System.out.println(i));
    }
    /*
    * skip方法
    * Stream<T> skip(long n); 跳过前n个元素，当n>len，返回空流
    * */
    public static void method6(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<Integer> stream1 = stream.skip(3);
        stream1.forEach((i)-> System.out.println(i));
    }
    /*
    * concat方法
    * static<T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b);
    * 连接两个流 静态方法
    * */
    public static void method7(){
        Stream<String> stream = Stream.of("1","2","3","4","5");
        Stream<String> stream1 = Stream.of("aaa","fff","vvvv");
        Stream<String> stream2 = Stream.concat(stream,stream1);
        stream2.forEach((i)-> System.out.println(i));
    }

    public static void casePractice(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("古力娜扎");
        arr.add("赵丽颖");
        arr.add("李易峰");

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("张天爱");
        arr1.add("张无极");
        arr1.add("张有钱");
        arr1.add("李易峰");

        Stream<String> arrStream = arr
                .stream()
                .filter(s->s.length()==3)
                .limit(3);
        Stream<String> arrStream2 = arr1
                .stream()
                .filter(s->s.startsWith("张"))
                .skip(2);

        Stream.concat(arrStream,arrStream2)
                .map(s->new Person(s))
                .forEach(p-> System.out.println(p));

    }

}
