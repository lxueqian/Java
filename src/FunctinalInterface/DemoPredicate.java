package javaCase.demo0327.FunctinalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
* Boolean predicate()接口 用于判断输入数据是否满足条件 有返回值
* Boolean test(source) 对source进行判断
* pre1.and(pre2).test(source) 逻辑与
* pre1.or(pre2).test(source) 逻辑与
* pre1.negate().test(source) 逻辑非
*
* 有返回值
* */
public class DemoPredicate {
    public static ArrayList<String> filter(String[] arr, Predicate<String> p1,Predicate<String> p2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = p1.and(p2).test(s);
            if (b){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","马儿扎哈,男","赵丽颖,女"};
        ArrayList<String> result = filter(arr, (String s) -> {
                    return s.split(",")[1].equals("女");
                },
                (String s) -> {
                    return s.split(",")[0].length() >= 4;
                });
        for (String s : result) {
            System.out.println(s);
        }
    }
}
