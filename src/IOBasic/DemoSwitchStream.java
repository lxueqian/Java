package javaCase.demo0327.IOBasic;

import org.omg.CORBA.portable.InputStream;

import java.io.*;

/*
* 编码：字符（能看懂）->字节（看不懂）1字符=2字节  汉字1字符=2/3字节
* 解码：字节（看不懂）->字符（看得懂）
*
* 字符编码：自然语言中的字符和二进制数的对应规则
* 字符集：ascii码 GBK Unicode字符集（utf8 utf16 utf32)
* ascii码: 共128个字符 7、8bits表示一字节 单字节编码
* GBK：双字节编码 最常用的中文码表 兼容ascii码表
* Unicode：标准万国码 最多使用4个字节来表示字母、符号、文字，有三种编码方案
*       utf8:使用1-4个字节为每个字节编码 大部分字都是三个字节，拉丁文2个字节
*
* FileInputStream->FileReader/InputStreamReader extends Reader中间有一个字节流向字符流转换的流
* FileOutputStream<-FileWriter/OutputStreamWriter
*                   查询默认码表  查询指定码表
* OutputStreamWriter(OutputStream out,String charsetName) 默认指定UTF-8/utf-8
*
* */
public class DemoSwitchStream {
    public static void main(String[] args) throws IOException {
        write_utf_8();
    }
    public static void write_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8");
        OutputStreamWriter ows = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");

        int len = 0;
        while((len=isr.read())!=-1){
            ows.write(len);
        }
        //ows.flush();可以省略 close会自动flush
        ows.close();
        isr.close();
    }

}
