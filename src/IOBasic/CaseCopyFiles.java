package javaCase.demo0327.IOBasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*文件复制：*/
public class CaseCopyFiles {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt"); //读取
        FileOutputStream fos = new FileOutputStream("acopy.txt"); //写入

        long s = System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        long e = System.currentTimeMillis();
        System.out.println("复制消耗时间："+(e-s)+"毫秒");


//        int len = 0;
//        while((len=fis.read())!=-1){
//            fos.write(len);
//        }

        fos.close();//先释放写入的资源
        fis.close();
    }
}
