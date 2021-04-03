package javaCase.demo0327;

import java.util.ArrayList;

public class ArrayListStu {
    /*自定义4个学生对象，添加到集合
    * 1.自定义学生类，四个部分：成员变量private,无参构造，全参构造，getter/setter方法
    * 2.创建一个集合存储学生对象 泛型：<Student>
      3.创建学生对象
      * 4.添加到集合*/
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳锋",21);
        Student three = new Student("黄药师",23);
        Student four = new Student("段执行",25);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("name:"+stu.getName()+"age:"+stu.getAge());
        }

    }
}
