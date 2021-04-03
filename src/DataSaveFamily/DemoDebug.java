package javaCase.demo0327.DataSaveFamily;

/*
* 设置断点：
*   行号右侧添加（每个方法的第一行，哪有bug添加在哪里）
*   右键选择debug执行程序
* 执行程序：
*   f8：逐行执行程序
*   f7：进入方法
*   f8+shift:跳出方法
*   f9：跳到下一个断点，如果没有则结束程序
*   ctrl+f2: 推出debug模式，停止程序
*   Console: 切换到控制台*/
public class DemoDebug {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
    }
}
