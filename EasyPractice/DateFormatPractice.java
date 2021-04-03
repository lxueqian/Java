package javaCase.demo0327;

/*父类是Format,是一个抽象类，
* 1.String format(Date date) 日期->文本
* 2.Date parse(String source) 文本-->日期
 * DateFormat类是抽象类，无法直接使用，可以使用SimpleDateFormat
 * y M d H m s*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatPractice {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }
    public static void demo01(){
        //1.创建SimpleDateFormat对象，构造方法中传递指定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //2.调用format
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);

    }

    public static void demo02() throws ParseException {
        //1.创建SimpleDateFormat对象，构造方法中传递指定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //2.调用parse
        //该方法声明了一个异常，调用一个抛出了异常的方法，就一定要处理这个异常，throws或者try catch
        //throws alt+enter 自动在方法名后面throws ParseException
        String s = "2021-03-19 13:04:55";
        Date date = sdf.parse(s);
        System.out.println(date);

    }
}

