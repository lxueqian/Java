package javaCase.demo0327;

public class Student {
    private String name;
    private int age;

    public Student() {  //alt+insert 无参构造/全参构造/成员变量私有/getter/setter
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
