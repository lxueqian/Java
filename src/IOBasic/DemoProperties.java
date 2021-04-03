package javaCase.demo0327.IOBasic;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*extends Hashtable<k,v> implements Map<k,v>
* 持久属性集。可以从流中加载或者保存，每个key,value默认是String
*       store 持久化集合中的临时数据
*       load  加载硬盘中的键值对文件读取到集合使用
*
* */
public class DemoProperties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","12");
        prop.setProperty("杨幂","13");
        prop.setProperty("迅猛龙","18");

        Set<String> strings = prop.stringPropertyNames();
        for (String s : strings) {
            System.out.println(s+":"+prop.getProperty(s));
        }

        //写入 store
        FileWriter fw = new FileWriter("prop.txt");//
        prop.store(fw,"Chinese legal");
        fw.close();

        prop.store(new FileOutputStream("prop1.txt"),"Chinese illegal");

        //读取 load
        Properties prop1 = new Properties();
        FileReader fr = new FileReader("prop.txt");
        prop1.load(fr);
        Set<String> strings1 = prop1.stringPropertyNames();
        for (String s : strings1) {
            System.out.println(s+"="+prop1.getProperty(s));
        }
    }

}
