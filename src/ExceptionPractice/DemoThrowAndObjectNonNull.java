package javaCase.demo0327.ExceptionPractice;

/*
* 对传入参数进行合理性校验
* 是否空指针是否越界
* throw new 异常类 可以指定捕获的异常类型
* throw关键字抛出了异常返回给调用者，我们就必须处理这个异常：
*   throw后创建的是RuntimeException或者其子类对象，可以不处理，默认交给JVM处理（打印+中断程序）
*   throw后创建的是编译异常，必须处理，要么throws要么try catch
*
* objects非空判断 对参数合法性进行判断，直接Objects.requireNonNull(obj)
* public static <T> T requireNonNull(T obj){
*   if(obj==null){
*       throw new NullPointerException();
*   return obj
* }*/
public class DemoThrowAndObjectNonNull {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int e = getElement(arr,3);
    }
    public static int getElement(int[] arr,int index){
        if(arr==null){
            throw new NullPointerException("传递数组值为null");
        }
        //相当于Objects.requireNonNull(arr);???????有点不对


        if(index<0 || index>arr.length){
            throw new ArrayIndexOutOfBoundsException("指针范围越界");
        }
        return arr[index];
    }
}
