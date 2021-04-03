package javaCase.demo0327.AnnotationBasic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 简单的测试框架_注解
*   当主方法执行后，会自动检测被注释的所有方法，判断方法是否有异常，记录到文件中
* */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class cls = c.getClass();

        Method[] methods = cls.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c,1,0);

                } catch (Exception e) {
                    number ++;
                    bw.write(method.getName()+"方法异常");
                    bw.newLine();
                    bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------------------------");

                }
            }
        }
        bw.write("本次测试一共出现"+number+"次异常");
        bw.flush();
        bw.close();


    }
}
