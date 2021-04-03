package javaCase.demo0327.LambdaFunctionalProgramming;

/*lambda表达式无参数无返回值练习
    invokeCook(()->{System.out.println("吃饭了");});
* 格式：(参数列表)->{一些重写方法的代码}
    解释说明：()：接口中抽象方法的参数列表，没有就空着，多个参数使用逗号分隔
            ->：传递，把参数传递给方法体
            {}：重写接口的抽象方法的方法体
*/
public class CaseLambdaNonparas {
    public static void main(String[] args) {
        //调用invokeCook方法，参数是Cook接口，传递接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //使用lambda表达式简化匿名内部类的书写
        invokeCook(()->{System.out.println("吃饭了");});

        //优化省略lambda
        invokeCook(()->System.out.println("吃饭了"));
    }


    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
