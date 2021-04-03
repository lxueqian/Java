package javaCase.demo0327.DataSaveFamily;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*java.util.Set接口 extends Collections接口
* Set:1. 不许存储重复元素 2.没有索引，不能使用for遍历
*
* java.util.HashSet集合 implements Set接口
* HashSet:1.无序,不会按照存入顺序输出 2.不重复 3.底层是哈希表结构，查询速度很快*/
public class DemoSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //添加
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set); //[1, 2, 3]

        //使用迭代器
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //使用增强for
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
