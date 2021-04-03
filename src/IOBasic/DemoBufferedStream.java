package javaCase.demo0327.IOBasic;

import java.io.*;

/*
缓冲流的作用：给基本的流增加一个缓冲区（数组）提高基本流的读写效率,减少系统IO次数
    因为io都是 程序->jvm->系统->调用系统方法读写
特有方法：br.readLine() 读取一行数据，以换行、回车为终止标志，返回该行内的字符串，注意不包含任何
                        终止符，如果到达末尾则返回null
        bw.newLine()

*
*/
public class DemoBufferedStream {
    public static void main(String[] args) throws IOException {
        //字节写入
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos); //BufferedOutputStream(in,size)指定缓冲区大小
        bos.write("我把数据写到内部缓冲区中".getBytes());
        bos.flush();
        bos.close();

        //字节读取
        FileInputStream fis = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len=0;
        while((len=bis.read())!=-1){
            System.out.println(len);
        }
        /*
        byte[] bytes = new byte[1024]; //不是Byte
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        * */
        bis.close();
        System.out.println("---------------------------");

        //字符写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("李雪倩");
            bw.newLine();//相当于bw.write("\r\n")  !!!!!!!特有
        }
        bw.flush();
        bw.close();

        //字符读取
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        String line = br.readLine();//!!!!!!!特有
        System.out.println(line);
        String line1;
        while((line1=br.readLine())!=null){
            System.out.println(line1);
        }
    }
}
