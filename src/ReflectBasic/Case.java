package javaCase.demo0327.ReflectBasic;

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
* */
public class Case {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //获取配置文件路径
        ClassLoader classLoader = Case.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");

        //加载配置文件
        Properties pro = new Properties();
        pro.load(is);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //创建类对象和实例，执行方法
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
