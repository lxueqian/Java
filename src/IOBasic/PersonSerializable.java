package javaCase.demo0327.IOBasic;

import java.io.Serializable;

/*Serializable接口也叫标记接口 只有实现了这个接口 这个类才能被序列化和反序列化
* 里面什么方法都没有 只有标记作用
*
* static关键字：不能被序列化，静态优先于非静态加载到内存，static修饰的成员变量不能被序列化，
*           序列化的都是对象
* transient瞬态关键字：修饰的成员变量也不能被序列化
* */
public class PersonSerializable implements Serializable {
    private String name;
    private static final long serialVersionUID=1L;//指定序列号 必须是static final long型

    @Override
    public String toString() {
        return "PersonSerializable{" +
                "name='" + name + '\'' +
                '}';
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+i);
        }
    }

    public PersonSerializable() {
    }

    public PersonSerializable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
