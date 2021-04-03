package javaCase.demo0327.LambdaFunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;

/*lambda表达式有参数无返回值练习
    Arrays.sort(arr,(Person o1,Person o2)->{return o1.getAge()-o2.getAge();});

对数组中的Person对象使用Arrays的sort方法进行年龄的升序排序*/
public class CaseLambdaParas {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("aaa",23),
                new Person("bbb",33),
                new Person("ccc",19),
        };

        //匿名内部类sort方法排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        //使用lambda表达式简化匿名内部类
        Arrays.sort(arr,(Person o1,Person o2)->{return o1.getAge()-o2.getAge();});

        //优化省略lambda
        Arrays.sort(arr,(o1,o2)->o1.getAge()-o2.getAge());

        //遍历查看排序结果
        for (Person person : arr) {
            System.out.println(person);
        }



    }
}
