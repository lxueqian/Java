package javaCase.demo0327.FileBasic;

import java.io.File;

/*
* File类遍历：
*   list和listFile方法遍历的是构造方法中给出的目录,有隐藏文件也可以返回
*   若目录不存在或给出的路径不是一个目录，会抛出空指针异常*/
public class DemoTravelFile {
    public static void main(String[] args) {
        show01();
    }
    public static void show01(){
        File file = new File("C:\\Users\\lxueqian\\Desktop\\prac_java\\prac_java\\src\\javaCase\\demo0327");
        //String[] list()实现浅层遍历
        String[] arr = file.list(); //返回String数组，表示指定路径下所有子文件或目录
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("---------------------------");

        //File[] listFiles()实现浅层遍历
        File[] files= file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
