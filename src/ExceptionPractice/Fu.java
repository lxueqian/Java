package javaCase.demo0327.ExceptionPractice;

/*父类异常什么样，子类异常就是什么样*/
public class Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}
/*一个源文件中只能有一个public类。
一个源文件可以有多个非public类。
源文件的名称应该和public类的类名保持一致。
例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
*/
class Zi extends Fu{
    //子类重写父类方法时，抛出与父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{}
    //子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类方法，不抛出异常///////注意和调用声明异常方法的区别，调用声明异常方法必须处理
    public void show03() {}
    //父类没有抛出异常，子类重写父类方法也不可抛出，只能try...catch
    public void show04(){
        try{
            throw new Exception("编译器异常");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //public void show04() throws Exception{} 报错 不能声明

}