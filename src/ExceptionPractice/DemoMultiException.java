package javaCase.demo0327.ExceptionPractice;

/*多个异常捕获：
*   可以一次捕获分别处理：
*       一个try多个catch：catch里面定义的异常变量如果有子父类关系，子类异常变量必须写在上面
*                       try中出现异常对象，会抛出给catch处理，从上往下依次赋给catch中定义的异常变量
*   也可以一次只捕获一个
*       多个try...catch..
* */
public class DemoMultiException {
}
