package javaCase.demo0327;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* Arrays工具类提供大量静态方法，实现数组操作
*   toString()
*   sort()
* */
/*使用Arrays把一个随机字符串升序排列并且倒叙打印*/
public class ArraysPractice {
    public static void main(String[] args) {
        String s = "ahsionvgioahesnbx";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);//升序

        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
