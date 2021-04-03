package javaCase.demo0327.DataSaveFamily;

/*HashSet存储自定义类型元素
* set集合报错元素唯一：存储的元素必须重写hashCode()和equals()方法*/

import java.util.HashSet;

public class DemoHashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("aaa",18);
        Person p2 = new Person("bbb",18);
        Person p3 = new Person("aaa",18);
        /*System.out.println(p1.hashCode()+","+p3.hashCode()); //460141958,1163157884
        System.out.println(p1==p3);//false

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);//[javaCase.demo0327.DataSaveFamily.Person@74a14482, javaCase.demo0327.DataSaveFamily.Person@4554617c, javaCase.demo0327.DataSaveFamily.Person@1b6d3586]
                        //Person类重写toString()方法 [Person{name='bbb', age=18}, Person{name='aaa', age=18}, Person{name='aaa', age=18}]*/


        //重写hashCode和equals方法后 自动生成

        System.out.println(p1.hashCode()+","+p3.hashCode()); //2986930,2986930
        System.out.println(p1==p3);//false
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);//[Person{name='aaa', age=18}, Person{name='bbb', age=18}]
    }
}
