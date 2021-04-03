package javaCase.demo0327.AnnotationBasic;

public class Calculator {
    @Check
    public int add(int a,int b){
        return a+b;
    }
    @Check
    public int sub(int a,int b){
        return a-b;
    }
    @Check
    public int mul(int a,int b){
        return a*b;
    }
    @Check
    public int div(int a,int b){
        return a/b;
    }
    public void show(){
        System.out.println("永无bug....");
    }
}
