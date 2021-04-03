package javaCase.demo0327.AnnotationBasic;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 设计一个框架，不改变代码就能够创建任意类对象，执行任意方法
*   实现：配置文件、反射
*   步骤：将需要创建的对象的全类名和需要执行的方法定义在配置文件中
*         加载配置文件进内存
*         使用反射技术来加载类文件进内存
*          创建对象、执行方法
*
* 在程序使用注解：获取注解中定义的属性值
*       1. 获取注解定义的位置的对象（Class Method Field)
*       2. 获取指定的注解 getAnnotation(Class)
*       3. 调用注解中的抽象方法获取配置的属性值 an.className()
* */

@caseProperties(className ="javaCase.demo0327.AnnotationBasic.CaseClass",methodName = "eat")
public class CaseReflectionProperties {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        /*//获取配置文件路径
        ClassLoader classLoader = Case.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");

        //加载配置文件
        Properties pro = new Properties();
        pro.load(is);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");*/

        //获取该类的字节码文件并获得注解接口对象   类.getAnnotation(注解类.class)
        Class<CaseReflectionProperties> cls = CaseReflectionProperties.class;
        caseProperties an = cls.getAnnotation(caseProperties.class);
        //上面这句话其实在内存中生成了一个该注解接口的子类实现类
        /*
        * public class casePropertiesImpl implements caseProperties{
        *   public String className(){
        *       return "javaCase.demo0327.AnnotationBasic.CaseClass";
        *   }
        * public String methodName(){
        *       return "eat";
        *   }
        * }
        * */
        String className = an.className(); //调用接口实现类的方法
        String methodName = an.methodName();

        //创建类对象和实例，执行方法
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
