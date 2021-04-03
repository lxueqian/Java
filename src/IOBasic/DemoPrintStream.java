package javaCase.demo0327.IOBasic;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*PrintStream打印流 extends OutputStream（字节输出流）
    特有方法 print println
    构造方法 PrintStream(File file/OutputStream out/String path)
    使用父类方法写数据 会使用码表转换 97->a write()
    使用自身方法写数据，写的数据会原样输出 97->97 println()
* */
public class DemoPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");
        PrintStream p = new PrintStream("目的地是打印流.txt");
        System.setOut(p);//把输出语句的目的地改变为打印流的目的地
                        //改变标准输出流的位置
        System.out.println("我在打印流的目标文件中输出");

    }
}
