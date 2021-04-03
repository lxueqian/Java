package javaCase.demo0327.FunctinalInterface;

import java.util.function.Supplier;

/*
* 常用函数式接口一
*   Supplier<T>接口被称作生产型接口，指定接口的泛型是什么类型，
*   那么接口中的get方法就会返回什么类型
*
* 有返回值
* */
public class DemoSupplier {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }
    public static int getMaxVaule(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
//        String s = getString(()->{return "huge";});
        String s = getString(()->"huge");
        System.out.println(s);

        int[] arr = {100,2,34,5,902};
        int maxValue = getMaxVaule(()->{
            int max = arr[0]; //数组不用传进去吗？？
            for (int i : arr) {
                if(i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
