package javaCase.demo0327;

import java.util.ArrayList;

public class ArrayListPrint {
    /*以指定格式打印集合的方法（知识点：Arraylist类型作为参数，传递的是地址）*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        printArrayList(list);

    }
    /*方法三要素：返回类型、方法名称、参数列表*/
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i==list.size()-1){
                System.out.print(name+"}");
            }else{
                System.out.print(name + "@");
            }
        }

    }
}
