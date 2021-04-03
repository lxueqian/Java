package javaCase.demo0327;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    /*用一个大集合存储20个随机数字，筛选其中偶数元素放到小集合中*/
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            biglist.add(num);
        }

        ArrayList<Integer> res = getSmallList(biglist);
        System.out.println(res);
        System.out.println(res.size());
    }

    //这个方法输入一个大集合，输出一个小集合
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num%2==0){
                smallList.add(num);
            }

        }
        return smallList;
    }
}
