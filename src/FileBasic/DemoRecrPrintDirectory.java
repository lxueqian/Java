package javaCase.demo0327.FileBasic;

import java.io.File;

/*递归打印多级目录
*   1.需定义一个方法，参数传递File类型目录，对目录进行遍历*/
public class DemoRecrPrintDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lxueqian\\Desktop\\prac_java\\prac_java\\src\\javaCase\\demo0327");
        getFileName(file);
    }

    public static void getFileName(File file){
        File[] files = file.listFiles();

        for (File file1 : files) {
            //类似于深度优先遍历 递归的底层就是用栈实现的
            if(file1.isDirectory()){
                getFileName(file1);
            }else{
                System.out.println(file1);
                //如果只想要.java结尾的文件
                //1.先把file类型转成String类型
                //String name= file1.getName();
                //String path = file1.getPath();
                String s = file1.toString();

                //2.借助字符串方法判断
                s = s.toLowerCase();
                boolean b = s.endsWith(".java");
                if(b){
                    System.out.println(file1);
                }

                //优化：链式编程 有返回对象的
                if(file1.toString().toLowerCase().endsWith(".java")){
                    System.out.println(file1);
                }

            }
        }

    }
}
