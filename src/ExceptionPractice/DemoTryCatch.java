package javaCase.demo0327.ExceptionPractice;

import java.io.FileNotFoundException;

/*
当父类或者接口没有声明抛出异常时，子类只能通过try catch捕获异常，不能抛出
try{
*   可能产生异常的代码
* }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
*   处理异常
* }catch(异常类名 变量名){
*   处理
* }
* ...
*finally{
*   无论是否出现异常都会执行
    finally中最好不要写return语句
* }
*
Throwable类中有三个异常处理方法：printStackTrace()、getMessage()、toString()
* */
public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            readFile("c:\\b.txt");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally {
            System.out.println("finished");
        }
    }
    public static void readFile(String filename) throws FileNotFoundException {
        if(!filename.equals("c:\\a.txt")){
            throw new FileNotFoundException();
        }
    }
}
