package javaCase.demo0327;

/*String底层是一个被final修饰的数组，不能改变，是一个常量
* StringBuilder字符串缓冲区 长度可以变化的字符串，底层也是数组但是没有被final修饰
  char[] value = new char[16] 自动扩容涨一倍16*/

public class StringBuilderPractice {
    public static void main(String[] args) {
        //无参数构造
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1: "+bu1);

        //带参数构造
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2: "+bu1);

        //成员方法append 添加任意类型，返回当前对象自身,无需接受返回值，直接在本身修改
        //这种方法可以链式编程，一直调用
        StringBuilder bu3 = bu1.append("123");
        System.out.println(bu1);
        System.out.println(bu3);
        System.out.println(bu1==bu3);

        //成员方法toString():转换为String
        String s = bu3.reverse().toString(); //反转字符串
        System.out.println(s);

    }
}
