package javaCase.demo0327;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HowManyBirthDays {
    /*使用日期时间相关api，计算出一个人已经出生了多少天*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your birthday, format:yyyy-mm-dd");
        String birthdayDateString = sc.next();

        //使用DateFormat类中的方法parse，把字符串的出生日期转换为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date birthdayDate = null;
        try {
            birthdayDate = sdf.parse(birthdayDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //把Date格式的出生日期转换为毫秒
        long birthdayDateTime = birthdayDate.getTime();

        //获取当前日期的毫秒值
        long todayTime = new Date().getTime();
        long time = todayTime - birthdayDateTime;
        System.out.println(time/1000/60/60/24);

    }
}
