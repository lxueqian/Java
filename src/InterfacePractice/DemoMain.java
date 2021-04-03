package javaCase.demo0327.InterfacePractice;

/*接口的基本使用、对象的上下转型、使用接口作为方法的参数*/
/*
* 接口
*   1.多个类的公共规范 引用数据类型，最重要的就是抽象方法（jdk8可以定义常量、默认方法、静态方法）
*        public interface 接口名{}
*
*   2.方法定义：
*        public abstract 返回值类型 方法名（参数）；
*              public abstract可以省略一个或者都省略
*   3.接口使用
*       不能直接使用，必须有实现类 public class 实现类 implements 接口{}
*       接口实现类必须实现接口所有抽象方法，否则就是抽象类
*       创建实现类对象
*   4.默认方法
*       public default 返回值类型 方法名称（参数列表）{方法体}
*       解决接口升级问题
*       可以被接口实现类调用，也可以被接口实现类覆盖重写
*   5.静态方法
*       public static 返回值类型 方法名称（参数列表）{方法体}
*       不能使用接口实现类的对象来调用接口中的静态方法，只能通过接口名称直接调用
*       接口名.静态方法名（参数）;
*   6.私有方法
*       普通私有方法：解决多个默认方法重复代码问题
*       静态私有方法：解决多个静态方法重复代码问题
*       private static 返回值类型 方法名称（参数列表）{方法体}
*   7.成员变量
*       (public static final) 数据类型 常量名称 = 数据值；
*       ()修饰符可以省略
*       一旦使用final就不能进行改变
*       接口中的常量必须进行赋值（最好用大写字母，下划线连接起名）
*   8.使用接口时
*       覆盖多个接口的方法，有重复的方法只要重写一个就行了
*       接口没有静态代码块或者构造方法
*       一个类的直接父类唯一，但是一个类可以实现多个接口
*       一个类如果直接父类方法和接口的默认方法有冲突，优先使用父类中的方法
*       多个接口默认方法如果有冲突，必须要重写该默认方法
*   9.类与接口
*       类与类是单继承
*       类与接口是多实现
*       接口与接口是多继承
*       注意：1）多个父接口中的抽象方法重复，没关系
*             2）多个父接口中的默认方法重复，子接口必须进行默认方法覆盖重写，【必须带default关键字】
*   10.面向对象三大特征：
*       封装性、继承性、多态性
*       extends或implements实现是多态性前提
*
 *   */

public class DemoMain {
    public static void main(String[] args) {
        //创建一个电脑
        Computer computer = new Computer();
        computer.powerOn();


        //首先进行向上转型
        USB usbMouse = new Mouse();  //左父又子是多态
        computer.useDevice(usbMouse);

        KeyBoard keyBoard = new KeyBoard();//未使用多态

        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyBoard); //也是正确写法,实现接口的类自动向上转型也可以充当usb类
        //使用子类对象、匿名对象也可以
        computer.useDevice(new KeyBoard());

        computer.powerOff();

    }

}
