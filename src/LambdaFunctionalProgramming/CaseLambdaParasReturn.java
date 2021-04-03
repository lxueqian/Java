package javaCase.demo0327.LambdaFunctionalProgramming;

/*lambda表达式有参数有返回值练习 invokeCalc(100,20,(int a,int b)->{return a+b;});
* 给定一个计算接口，内涵抽象方法得到两数和*/

//用于一个抽象类或者一个接口作为参数的情况
public class CaseLambdaParasReturn {
    public static void main(String[] args) {
        //调用 使用匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a+b;
            }
        });

        //使用lambda表达式
        invokeCalc(100,20,(int a,int b)->{return a+b;});

        //优化省略lambda
        invokeCalc(100,20,(a,b)->a+b);


    }
    /*定义方法
     * 参数传递两个int类型证书
     * 参数传递Calculator接口
     * 方法内部调用calc方法计算两个整数和*/
    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.cal(a,b);
        System.out.println(sum);
    }

}
