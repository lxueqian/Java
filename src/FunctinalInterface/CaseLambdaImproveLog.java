package javaCase.demo0327.FunctinalInterface;

/*
* lambda延迟加载
* 使用前提：必须存在函数式接口,接口作为方法的参数
* */
public class CaseLambdaImproveLog {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Li";
        showLog(1,()->{
            System.out.println("不满足条件不会执行");return msg1+msg2+msg3;});

    }
    /*使用lambda表达式进行参数传递，仅仅传递参数，只有满足条件才会调用接口中的方法，进行字符串拼接
    * 如果不满足条件不会执行方法
    * 所以不会存在性能浪费
    * */

    public static void showLog(int level,MessageBuilder mb){
        if(level==1){
            System.out.println(mb.builderMessage());
        }
    }
}
