package javaCase.demo0327;

import java.util.ArrayList;
import java.util.List;

public class DuoTai {
    public static void main(String[] args) {
        //接口和继承都可以实现多态，左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list  = new ArrayList<>();

        List<String> result = addNames(list);
    }

    public static List<String> addNames(List<String> list){
        System.out.println("接口可以作为方法的返回类型以及参数类型");
        return list;
    }
}
