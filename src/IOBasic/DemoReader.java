package javaCase.demo0327.IOBasic;

import java.io.FileReader;
import java.io.IOException;

/*用字节流读取中文会乱码，所以引入字符流
*   抽象类
*   成员共性方法 read() close()
*
*   java.io.FileReader extends InputStreamReader extends Reader 文件字符读取流*/

public class DemoReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        //可以一次读取多个字符/一个字符
        char[] chars = new char[1024];
        int len = 0;
        while((len=fr.read(chars))!=-1){
            System.out.println(len);
            System.out.println(new String(chars,0,len));
        }
    }
}
