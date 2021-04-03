package javaCase.demo0327.DataSaveFamily;

/*
可变参数：
使用前提：方法的参数列表数据类型已经确定，但是参数个数不确定
使用格式：
    修饰符 返回值类型 方法名（数据类型....变量名）{}
原理：
    底层是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
    传递的参数个数可以时0、1、2、3等多个
注意事项：
    一个方法参数列表只能有一个可变参数
    若方法参数多个，可变参数只能写在参数列表末尾
可变参数特殊写法：
    public void method(Object...obj) 接收任意类型任意个数参数
*/
public class DemoVarArgs {
    public static void main(String[] args) {
        int i = add(2,3);
        System.out.println(i);
    }
    /*计算0-n整数和的方法
    * add(2) 创建一个长度为2的数组，存储传递过来的参数 new int[2]*/
    public static int add(int...arr){
        System.out.println(arr); //[I@1b6d3586 底层是一个数组
        System.out.println(arr.length);//2
        int sum = 0;
        //遍历传入数组
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
