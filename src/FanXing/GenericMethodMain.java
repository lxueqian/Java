package javaCase.demo0327.FanXing;

public class GenericMethodMain {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01(10);
        gm.method01("and");
        gm.method01(true);

        //调用
        gm.method02("静态方法不建议创建对象使用");

        //静态方法通过  类名.方法名(参数)  可以直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }
}
