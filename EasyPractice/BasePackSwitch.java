package javaCase.demo0327;

public class BasePackSwitch {
    public static void main(String[] args) {
        //基本类型->字符串（string)
        int i1=100;
        String s1 = i1 + "";
        System.out.println(s1+200);//100200

        String s2 = Integer.toString(100);
        System.out.println(s2+200);//100200

        String s3 = String.valueOf(100);
        System.out.println(s3+200);//100200

        //字符串-->基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i-10);//90
    }
}
