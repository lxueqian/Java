package javaCase.demo0327.IOBasic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* java.io.OutputStream 字节输出流
* 定义了一些字节输出流共性方法：close() flush() write(byte[] b)
*
* java.io.FileOutputStream extends OutputStream 文件字节输出流：内存中的数据写入硬盘文件
*   1.构造方法 FileOutputStream(String name)把字节输出到路径名为name的文件中
*             FileOutputStream(File file)创建一个向指定File对象表示的文件中写入数据的文件输出流
*         注意:构造方法会根据方法中传递的文件/文件路径，创建一个空的文件，然后把FileOutputStream对象
*              指向创建好的文件
*   2.写入数据的原理：
*           java程序->jvm->os->调用写数据方法->把数据写入文件
*   3.字节输出流使用：
*           创建FileOutputStream类
*           调用write方法写入数据
*           释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率）
*   4.追加写
*       FileOutputStream(String name，boolean append)把字节输出到路径名为name的文件中
 *      FileOutputStream(File file，boolean append)创建一个向指定File对象表示的文件中写入数据的文件输出流
 *      参数：true 创建对象不会覆盖原文件，继续在文件末尾追加数据
 *           false创建一个新文件覆盖源文件
 *
 *  5.换行写
 *      window:\r\n
 *      linux:/n
 *      mac:/r
* */
public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        //硬盘中存储的数据都是字节，1个字节=8个比特，以二进制存储
        //写数据时，会把十进制整数97转换为二进制存储
        //打开文件时，文件编辑器会查询编码表，把字节显示为字符表示
        FileOutputStream fos = new FileOutputStream("a.txt");
        writeSome(fos);

        //追加和换行 append
        FileOutputStream fos1 = new FileOutputStream("a.txt",true);
        for (int i = 0; i < 10; i++) {
            fos1.write("你好".getBytes());
            fos1.write("\r\n".getBytes());
        }

    }
    public static void writeSome(FileOutputStream fos) throws IOException {
        fos.write(97);//打开文件显示a 把97的字节转换为字符表示了

        //在文件中写入100
        fos.write(49); //1
        fos.write(48); //0
        fos.write(48); //0

        /*一次写多个字节:
        *   若写的第一个字节是正数（0-127） 显示的时候会查询ASCII码表
        *   若写的第一个字节是负数，那么第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认
        *       查询GBK
        */
        byte[] bytes = {65,66,67,68,69};//ABCDE
        byte[] bytes1 = {-65,-66,-67,68,69};//烤紻E
        fos.write(bytes);
        fos.write(bytes1);
        fos.write(bytes,1,2);//BC 把字节数组的一部分写入 off:起始索引 len:长度

        /*写入字符串方法：String类中的方法把字符串转换为字节数组
        *   byte[] getBytes()
        *   显示需使用：Arrays.toString(bytes)
        * */
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));//[-28, -67, -96, -27, -91, -67] //utf-8三个字节是一个中文
        fos.write(bytes2);//你好 GBK中两个字节是一个中文


        fos.close();
    }
}
