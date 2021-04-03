package javaCase.demo0327.IOBasic;

import java.io.FileWriter;
import java.io.IOException;

/*字符写入流 write() flush() close()
*   FileWriter extends OutputStreamWriter extends Writer*/
public class DemoWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt");
        fw.write(97);
        fw.flush();//比字节写入流多出一个，用于把缓存区的数据写到磁盘上

        char[] cs = {'a','b','c','d','e'};
        fw.write(cs);
        fw.write(cs,0,3);
        fw.write("你好吗");
        fw.write("你好吗",0,1);
        fw.flush();
        fw.close();

        //追加和换行
        FileWriter fw1 = new FileWriter("a.txt",true);

        for (int i = 0; i < 10; i++) {
            fw1.write("Hello"+"\r\n");
        }
        fw1.close();
    }
}
