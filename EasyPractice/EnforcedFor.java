package javaCase.demo0327;

import java.util.ArrayList;

public class EnforcedFor {
    /*增强for循环底层使用迭代器，实现public interface Iterable<T>这个接口允许对象成为foreach的语句目标
    * 用来遍历集合和数组
    * Collection<E>extends Iterable<E> 所有的集合都可以使用增强for*/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i:
             arr) {
            System.out.println(i);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        for (String s:list){
            System.out.println(s);
        }
    }
}
