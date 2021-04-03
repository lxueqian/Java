package javaCase.demo0327.ExceptionPractice;

import java.io.FileNotFoundException;
import java.io.IOException;

/*throws:异常处理交给jvm，当方法内部抛出异常对象，可以使用它把异常对象声明抛出给方法的调用者处理，最终交给jvm
* 处理，中断程序打印异常
*
*  修饰符 返回值类型 方法名（参数列表） throws AAAException...{}
*
* 注意：1. throws必须放在方法声明处
*       2. 声明的异常必须是Exception类或者其子类
*       3. 方法内部若抛出多个异常对象，throws后面必须要声明多个异常，若有父子类关系，可以直接声明父类异常
*       4. 调用了一个声明抛出异常的方法，必须处理声明的异常：try catch或者throws
*       5.当父类或者接口没有声明抛出异常时，子类只能通过try catch捕获异常，不能抛出
*
* 抛出异常必须保证该类的所有超类都有声明异常，否则会报错
* */
public class DemoThrows {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tx");
    }
    /*FileNotFoundException是一个编译异常，就必须处理异常，throws FileNotFoundException*/
//    public static void readFile(String filename) throws FileNotFoundException,IOException {
    public static void readFile(String filename) throws IOException {
        if(!filename.equals("c:\\a.txt")){
            throw new FileNotFoundException();
        }
        if(!filename.endsWith(".txt")){
            throw new IOException();
        }
    }
}
