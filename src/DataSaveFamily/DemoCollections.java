package javaCase.demo0327.DataSaveFamily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Collections有三个静态方法常用
 Collections.add() Collections.sort() Collections.shuffle()
* sort(list)
* 使用前提：被排序的集合里面存储的元素必须实现Comparable，重写compareTo方法
*          Comparable接口排序规则：自己（this)-参数：升序
*
* public static <T> void sort(List<T> list,Comparator<? super T>):将集合按照指定规则排序
*      Comparable:自己（this)和别人（参数）比较，自己需要实现Comparable接口，重写compareTo方法
*      Comparator:借助一个匿名第三方比较，自己不需要实现接口
*      Comparator排序规则：o1-o2升序
*
* */
public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //添加多个
        Collections.addAll(list,"a","b","v","c","d");
        System.out.println(list); //[a, b, v, c, d]

        //打乱顺序
        Collections.shuffle(list);
        System.out.println(list); //[b, a, c, v, d]

        Collections.sort(list); //升序
        System.out.println(list); //[a, b, c, d, v]

        //排序
        Person p1 = new Person("aaa",18);
        Person p2 = new Person("bbb",12);
        Person p3 = new Person("ccc",19);

        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        Collections.sort(listPerson);
        System.out.println(listPerson);//[Person{name='bbb', age=12}, Person{name='aaa', age=18}, Person{name='ccc', age=19}]

        //用匿名内部类排序
        ArrayList<Integer> listo1o2 = new ArrayList<>();
        listo1o2.add(3);
        listo1o2.add(1);
        listo1o2.add(2);
        System.out.println(listo1o2);


        Collections.sort(listo1o2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2; //升序
//                return o1.getAge()-o2.getAge(); //对象升序排序
            }

        });

        //多个条件排序
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge()-o2.getAge(); //先按照年龄升序排序
                //如果两个人年龄相同，再使用姓名第一个字母升序比较
                if (result==0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });

        System.out.println(listo1o2);
    }
}
