package javaCase.demo0327.DataSaveFamily;

import java.util.HashMap;
import java.util.Map;

/*HashMap存储自定义类型键值
* Map集合保证key是唯一的：作为key的元素必须重写hashCode()和equals()方法以保证key唯一
* 如果key是有序的，会自动按照key的字母顺序或者数字顺序升序排序 例子可以参见IOBasic/CaseSortText*/
public class DemoHashMapSavePerson {
    public static void main(String[] args) {
        show01();
    }
    private static void show01(){
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("张三",18),"北京");
        map.put(new Person("张三",18),"上海");
        map.put(new Person("张无",49),"北京");
        System.out.println(map);

    }
}
