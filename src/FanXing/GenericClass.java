package javaCase.demo0327.FanXing;

public class GenericClass<E> {
    /*定义一个含有泛型的类，创建对象的时候确定泛型的数据类型
    修饰符 class 类名<泛型>{}*/
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

/*public class GenericClass {
    private String name; //name的返回值和设置值都只能是字符串

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/
