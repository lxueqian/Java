package javaCase.demo0327.IOBasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DemoIOTryCatch {
    public static void main(String[] args) {
        FileWriter fw1 = null; //提高变量的作用域让finally可以使用
        try {
            fw1 = new FileWriter("a.txt",true);
            for (int i = 0; i < 10; i++) {
                fw1.write("Hello" + "\r\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //如果创建对象失败fw默认值为null 无法调用方法，会出现空指针异常，需要增加一个判断
            if(fw1!=null){
                try {
                    fw1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //try(定义流对象；定义流对象；...){}catch(){} 定义的流对象可以自动释放资源无需finally
    //jdk9里面可以在前边定义流对象，在try的（）中直接引入流对象名称
    //A a = new A();B b = new B(); try(a,b){}catch{}

    public static void ImprovedTryCatch(){
        try(FileInputStream fis = new FileInputStream("a.txt");
            FileOutputStream fos = new FileOutputStream("acopy.txt"); ) {

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
