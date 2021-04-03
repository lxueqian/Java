package javaCase.demo0327.LambdaFunctionalProgramming;

/*Lambda表达式标准格式：
    一些参数+一个箭头+一段代码
    格式：(参数列表)->{一些重写方法的代码}
    解释说明：()：接口中抽象方法的参数列表，没有就空着，多个参数使用逗号分隔
            ->：传递，把参数传递给方法体
            {}：重写接口的抽象方法的方法体
* */
public class DemoLambda {
    public static void main(String[] args) {
        //匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }).start();

        //使用lambda表达式实现多线程
        new Thread(()-> {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }).start();
    }
}
