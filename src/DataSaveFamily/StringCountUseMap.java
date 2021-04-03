package javaCase.demo0327.DataSaveFamily;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*计算一个字符中每个字符出现的次数*/
public class StringCountUseMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        Map<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                Integer val = map.get(c);
                val++;
                map.put(c,val);
            }else{
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey()+":"+entry.getValue()+"---");
        }

        for (Character c : map.keySet()) {
            System.out.println(c+"::"+map.get(c));
        }

    }
}
