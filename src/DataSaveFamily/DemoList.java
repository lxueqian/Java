package javaCase.demo0327.DataSaveFamily;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/*java util.list接口 extends Collection接口
* List接口: 有序、有索引、允许重复*/

/*JDK9新特性：
*   List接口、Set接口、Map接口，增加一个静态方法of，给集合一次性添加多个元素
*   使用前提：集合存储的元素个数确定，不会再改变
*   注意：of方法不适用于上面三个接口的实现类
*        of方法返回值是一个不能改变的集合，不能使用add,put方法增加元素，会抛出异常
*        set接口和map接口调用of方法的时候不能用重复元素，否则抛出异常*/

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list); //[a, b, c, d]打印的不是地址说明重写了toString()方法

        list.add(3,"insert between c and d");
        System.out.println(list);

        String removeE = list.remove(2);
        System.out.println("remove: "+removeE);
        System.out.println(list);

        String setA = list.set(0, "A"); //list.set(0, "A").var
        System.out.println("replace: "+setA);
        System.out.println(list);

        //普通for循环
        for (int i = 0; i<list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("++++++++++++");
        //迭代器 泛型接口
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("++++++++++++");
        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        //注意防止索引越界异常 Array String List

//        //jdk9 of方法
//        List<String> li = List.of("s","f","g","b","h");
//        System.out.println(li);

    }
}
