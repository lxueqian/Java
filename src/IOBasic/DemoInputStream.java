package javaCase.demo0327.IOBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* java.io.InputStream字节输入流 是一个抽象类，表示字节输入流的所有类的超类
* 定义了所有子类的共性方法：int read() close()
*
* java.io.FileInputStream extends InputStream 字节输入流
*   把硬盘文件中的数据读取到内存中
*   1.构造方法 FileInputStream(String name)
*              FileInputStream(File file)  参数：读取文件的数据源
*   2.字节输入流读取文件步骤：
*       创建FileInputStream对象，给定数据源地址
*       调用read方法
*       释放资源
*   3.一次读取一个字节 int read() 返回的是字节的码
*   4.一次读取多个字节
*       int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
*           方法参数byte[]起到缓冲作用，存储每次读取到的多个字节
*               数组长度一般定义为1024(1kb)或者1024整数倍
*           方法返回值int:表示每次读取的有效字节个数
*       String类的构造方法：
*           String(byte[] bytes)：把字节数组转换为字符串
*           String(byte[] bytes,int offset,int length)把字节数组的一部分转换为字符串
*
*
* */
public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");

        //一次读取一个字节
        System.out.println(fis.read());//97 表示a  a100ABCDE烤紻EBC浣犲ソ浣犲ソ


        int len = 0; //记录读取到的字节
        while((len=fis.read())!=-1){ //固定写法 -1表示读到了末尾
            System.out.println(len); //97
            System.out.println((char)len); //a
        }
        System.out.println("循环读取文件=======");


        //一次读取多个字节+转成String展示
        // int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        byte[] bytes = new byte[2];
        int len2 = fis.read(bytes); //返回的是读取的有效字节的个数
        System.out.println(len2);
        System.out.println(new String(bytes));//把字节转换为字符串输出 a1,增强可读性

        byte[] bytes1 = new byte[1024];
        int len3 = 0 ;
        while((len3=fis.read(bytes1))!=-1){
            System.out.println(new String(bytes1));
            System.out.println(new String(bytes1,0,10));//00ABCDE���
        }
        fis.close();

    }
}
