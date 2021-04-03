package javaCase.demo0327.ExceptionPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*java.lang.Throwable类是java语言中所有错误或者异常的超类
*   Exception:编译期异常，写代码问题
*       RuntimeException：运行期异常
*   Error:错误
*       必须修改源代码，程序才能继续（工程师不能处理）
*
*  Throwable类中三个异常处理的方法：
*       public String getMessage()
*       public String toString()
*       public void printStackTrace()
* */

public class DemoException {
    public static void main(String[] args) /*throws ParseException */{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        //编译器异常 会出现红线
//        try {
//            date = sdf.parse("1999-11-20");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        } 自己处理（try..catch)或者让虚拟机处理（遇到错误停止程序+报错）
//        System.out.println(date);

        //RuntimeException 运行期异常
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }

        //Error 内存溢出 不是代码问题


    }
}
