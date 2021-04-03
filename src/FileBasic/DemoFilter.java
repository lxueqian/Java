package javaCase.demo0327.FileBasic;

import java.io.File;
import java.io.FilenameFilter;

/*
* 遍历文件夹以及其子文件夹，获取以.java结尾的文件
*   除了每次用字符串方法判断
*   可以使用过滤器来实现
*       File类中有两个和ListFiles重载的方法，方法传递参数就是过滤器
*
*       java.io.FileFilter接口：用于抽象路劲名的过滤器
*           boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径名列表中
*       java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
*           boolean accept(File dir,String name)测试指定文件是都应该包含在某一个文件列表中
*                               目录        文件或者文件夹名
*
*       两个过滤器接口是没有实现类的，需要自己写实现类，重写过滤方法accept定义过滤规则
*
* */
public class DemoFilter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lxueqian\\Desktop\\prac_java\\prac_java\\src\\javaCase\\demo0327");
        getFileName(file);
    }
    public static void getFileName(File file){

        //File[] listFiles()实现遍历 增加了过滤规则
        File[] files= file.listFiles(new DemoFileFilter());//不要忘记（）
        for (File file1 : files) {
            System.out.println(file1);
        }
        System.out.println("========================");

        //匿名内部类
        File[] files2= file.listFiles(new DemoFileFilter(){
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".java");}});
        System.out.println("========================");

        //lambda
        File[] files3= file.listFiles((pathname)->pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".java"));

        System.out.println("========================");
        //使用FilenameFilter()
        File[] files4 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });
    }
}
