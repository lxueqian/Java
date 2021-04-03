package javaCase.demo0327.ExceptionPractice;

/*自定义异常类
*   public class XXXException extends Exception|RuntimeException{
*       空参构造
*       带异常信息的构造
*   }
*   自定义异常类名一般以Exception结尾
*   必须继承 Exception 自定义异常为编译期异常，必须处理：throws或者try catch
*           RuntimeException 自定义异常为运行期异常，无需处理，交给jvm
*
* */
public class DemoRegisterException extends Exception{
    //空参构造
    public DemoRegisterException() {
    }

    //所有异常类都会有一个带异常信息的构造方法，该方法调用父类的异常信息构造方法，让父类来处理
    public DemoRegisterException(String message) {
        super(message);
    }
}
