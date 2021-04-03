package javaCase.demo0327.FileBasic;

import java.io.File;

/*java.util.File类
*使用File类对文件和文件夹进行操作
* File类与操作系统无关，任何操作系统都可以使用这个类中的方法
*
* File类静态变量 File.pathSeparator  File.separator
*
* 绝对路径：一个完整路径，以盘符开始
* 相对路径：
*   1.路径不区分大小写
*   2.windows中文件分隔符使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通反斜杠
*       C:\\User\\itcast
*
* File类构造方法：
*   1.File(String filename) 路径名可以存在也可不存在
*   2.File(String parent, String child) 根据父路径和子路径名字符串创建一个File实例
*   2.File(File parent, String child) 根据父路径和子路径名字符串创建一个File实例
*           父路径可以使用File方法对路径进行操作
*
* File类常用方法：(对象调用方法）
*   1.获取 getName() getPath() getAbsolutePath() f1.length()
*   2.判断 exists() isDirectory()是否是文件夹 isFile()
*   3.创建 createNewFile():文件不存在则创建文件返回true 存在则不创建并且返回false
*                           只能创建文件 路径必须存在
*                           方法声明抛出了IOException 调用时必须处理
*          boolean mkdir()：创建单级文件夹
*          boolean mkdirs()：可以创建多级文件夹 file.mkdirs()
*                            只能创建文件夹
*   4.删除  boolean delete():可以删除File构造方法路径中给出的文件、文件夹
*                           若路径不存在返回false delete会直接在硬盘中删除 删除要谨慎
* */
public class DemoFile {
    public static void main(String[] args) {
        //System.out.println(File.pathSeparator);//路径分隔符 win; linux:
        //System.out.println(File.separator);//分隔符 win \  linux /

        //showFileConstruct();
        showFileGetMethod();
    }

    public static void showFileConstruct(){
        //
        File f1 = new File("C:\\Users\\lxueqian\\Desktop");
        System.out.println(f1);

        File f2 = new File("a.txt");
        System.out.println(f2);

        File f3 = new File("C:\\Users\\lxueqian\\Desktop","a.txt");
        System.out.println(f3);

        File f4 = new File(f1,"a.txt");
        System.out.println(f4);
    }

    public static void showFileGetMethod(){
        File f1 = new File("C:\\Users\\lxueqian\\Desktop\\求职简历\\V2");
        System.out.println(f1.getAbsolutePath()); //获取File绝对路径名字符串
        System.out.println(f1.getPath()); //将此File转换为路径字符串
        System.out.println(f1.getName());   //返回由此File表示的文件或目录的名称
        System.out.println(f1.length());    //返回由此File表示的文件长度（大小）以字节为单位 路径不存在则返回0
        /*  C:\Users\lxueqian\Desktop\求职简历\V2
            C:\Users\lxueqian\Desktop\求职简历\V2
            V2
            4096(文件夹）
        */
        if(f1.exists()){
            System.out.println(f1.isDirectory()); //true
            System.out.println(f1.isFile()); //false
        }

    }
}
