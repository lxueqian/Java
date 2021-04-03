package javaCase.demo0327;

import java.util.Date;

public class DatePractice {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    /*获取当前日期*/
    public static void demo01(){
        Date date = new Date();
        System.out.println(date); //Sat Mar 27 15:26:10 CST 2021

    }

    /*把毫秒值转换为日期 long类型*/
    public static void demo02(){
        Date date = new Date(0);
        System.out.println(date); //Thu Jan 01 08:00:00 CST 1970

    }


    /*把日期转换为毫秒 long类型，相当于System.currentTimeMillis()方法，返回自1970.1.1 00：00：00以来的毫秒数*/
    public static void demo03(){
        Date date = new Date();
        System.out.println(date.getTime()); //1616830362404
    }



}
