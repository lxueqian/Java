package javaCase.demo0327.FanXing;

import java.util.ArrayList;
import java.util.Iterator;

/*泛型通配符：不能创建对象使用，只能在方法参数中使用*/
public class GenericSymbol {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("s");
        list02.add("t");
        /*定义一种方法能遍历所有类型的ArrayList集合，但是ArrayList存储数据类型不知道
        * 泛型没有继承概念 */

        printArray(list01);
        printArray(list02);

    }

    //作为方法参数
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            //it.next()方法取出的元素就是object，可以接收任意数据类型
            Object o = it.next();
            System.out.println(o);
        }
    }

    //泛型上限限定：？ extends E  使用的泛型必须是E的子类或者本身
    //泛型下限限定：？ super E 使用的泛型必须是E的父类或者本身
}
