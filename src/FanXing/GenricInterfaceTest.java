package javaCase.demo0327.FanXing;

public class GenricInterfaceTest {
    public static void main(String[] args) {
        //创建GenericInterfaceImpli实现类
        GenericInterfaceImpli gi1 = new GenericInterfaceImpli();
        gi1.method("调用泛型接口实现类的第一种方式");

        GenericInterfaceImpli2<String> gi2 = new GenericInterfaceImpli2<String>();
        gi2.method("调用泛型接口实现类的第二种方式");
    }

}
