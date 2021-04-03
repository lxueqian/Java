package javaCase.demo0327.FanXing;

public class GenericMethod {
    /*定义含有泛型的方法：泛型定义在方法修饰符和返回值类型之间
    * 修饰符 <> 返回值类型 方法名(参数列表)*/

    public <M> void method01(M m){
        System.out.println(m);
    }

    //定义一个含有泛型的静态方法
    public static<S> void method02(S s){
        System.out.println(s);
    }
}
