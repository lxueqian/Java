package javaCase.demo0327.FanXing;

/*含有泛型的接口使用
* 定义接口的实现类（指定泛型类型） 或者 接口实现类未指定泛型类型
* public interface Iterator<E>{
*   E next();
* }
* Scanner类实现了Iterator接口，并指定接口泛型是String，所以重写的next方法泛型默认就是String
* public final class Scanner implements Iterator<String>{}*/

public class GenericInterfaceImpli implements GenericInterface<String> { //容易忘记

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
