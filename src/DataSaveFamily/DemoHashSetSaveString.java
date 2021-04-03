package javaCase.demo0327.DataSaveFamily;

import java.util.HashSet;

/*hashSet底层哈希表=数组(初始容量16)+链表/数组+红黑树
* Set集合在调用add方法时，
* add方法会调用元素的hashCode方法和equals方法，判断元素是否重复
* 先hashCode相同，再equals返回true，认为两个元素相同*/

public class DemoHashSetSaveString {
    HashSet<String> set = new HashSet<>();
    String s1 = new String("abc");
    String s2 = new String("abc");
}
