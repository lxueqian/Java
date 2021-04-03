package javaCase.demo0327;

public class StringConcat {
    /*按照指定格式把{1，2，3}拼成一个字符串
    * 方法三要素：返回值类型、方法名称、参数列表
    * 调用方法*/
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String s = fromArrayToString(array);
        System.out.println(s);
    }
    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                str += "word"+ array[i] + "]"; //array[i]
            }else{
                str += "word" + array[i] + "#";
            }

        }
        return str;
    }
}
