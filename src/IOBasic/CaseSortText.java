package javaCase.demo0327.IOBasic;

import java.io.*;
import java.util.HashMap;

/*对文本内容排序
*   */
public class CaseSortText {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        String line;
        while((line=br.readLine())!=null){
            String[] arr = line.split("\\."); //用序号后的点切割
            map.put(arr[0],arr[1]);
        }

        for (String key : map.keySet()) { //HashMap会对key自动排序
            String value = map.get(key);
            line = key+"."+value;
            bw.write(line);
            bw.newLine(); //自动添加换行
        }

        bw.close();
        br.close();
    }
}
