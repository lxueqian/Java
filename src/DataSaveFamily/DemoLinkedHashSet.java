package javaCase.demo0327.DataSaveFamily;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*extends HashSet集合
* LinkedHashSet集合：底层是一个哈希表（数组+链表/红黑树）+（双向？）链表：多了一个链表记录元素存储顺序，保证元素有序*/
public class DemoLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("lll");
        System.out.println(set);

        LinkedHashSet<String> sett = new LinkedHashSet<>();
        sett.add("www");
        sett.add("abc");
        sett.add("abc");
        sett.add("lll");
        System.out.println(sett); //有序
    }
}
