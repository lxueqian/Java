package javaCase.demo0327.JunitTest;

/*Junit单元测试
 * 黑盒测试：不需要写代码，给输入判定输出是否正确
 * 白盒测试：需要写代码，关注程序执行程序
 * */
/*下面这种方法不好用，新建一个TEST包建立测试类*/
public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator c = new Calculator();
        //调用测试方法
        System.out.println(c.sub(1,1));
    }
}
