package javaCase.demo0327.DataSaveFamily;

/*Map集合是一个双列集合、无序、key唯一、kv一一对应
两个常用实现类：
* HashMap<K,V>集合 implements Map<k,v>接口
* HashMap:1.底层是哈希表，查询速度很快，数组+单向链表/红黑树
*         2.无序集合，存取顺序不定
*
* java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
* LinkedHashMap：1.底层是哈希表+双向链表
*                2.有序集合*/

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        show02();
    }
    public static void show01(){
        Map<String,String> map = new HashMap<>();

        //put方法key不会重复，key相同的value会发生覆盖，返回值是被覆盖的value或null
        String v1 = map.put("李晨","范冰冰");
        System.out.println("v1:"+v1);
        String v2 = map.put("李晨","分手了");
        String v3 = map.put("lixueqian","meinv");
        System.out.println("v2:"+v2);
        System.out.println("v3:"+v3);
        System.out.println(map);
    }

    public static void show02() {
        Map<String, Integer> map = new HashMap<>();

        //remove方法若value存在则返回，否则返回null
        map.put("战力",123);
        map.put("杨颖",167);
        map.put("林志玲",178);
        System.out.println(map);

        Integer v1 = map.remove("战力");
        System.out.println("v1:"+v1);
        System.out.println(map);


    }
}
