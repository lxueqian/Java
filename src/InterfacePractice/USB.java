package javaCase.demo0327.InterfacePractice;

/*实现接口或继承抽象类的子类必须实现接口的所有方法或抽象类的所有抽象方法。
接口中的所有方法均为抽象方法，抽象类中包含非抽象方法和抽象方法。
如果一个类实现了接口，那么该子类必须实现父接口的所有方法。
如果一个类继承了抽象类，那么该子类必须实现抽象类的所有抽象方法。
。*/
public interface USB {
    public abstract void open();//打开设备
    public abstract void close();//关闭设备
}
