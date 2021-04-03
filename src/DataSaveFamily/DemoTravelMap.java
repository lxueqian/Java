package javaCase.demo0327.DataSaveFamily;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Map集合两种遍历方式：
1. 通过键找值的方式
* Map集合中的方法：
*   Set<K> keySet() 返回此映射中包含的键的Set集合
* 步骤：取key、遍历KeySet、找对应value
2.Entry对象是map接口中的一个内部接口，记录键与值
    Set<Map.Entry<K,V>> entrySet()
  步骤： entrySet()方法，遍历Set集合获取每一个Entry对象，使用Entry对象的getKey和getValue方法
  */
public class DemoTravelMap {
    public static void main(String[] args) {
//        show1();
        show2();
    }
    public static void show1(){
        Map<String,Integer> map = new HashMap<>();
        map.put("战力",123);
        map.put("杨颖",167);
        map.put("林志玲",178);
        System.out.println(map);

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-----------");

        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-----------");

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

    public static void show2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("战力",123);
        map.put("杨颖",167);
        map.put("林志玲",178);
        System.out.println(map);

        Set<Map.Entry<String,Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("-----------");
        for (Map.Entry<String,Integer> entry:set){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
