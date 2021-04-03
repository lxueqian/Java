package javaCase.demo0327.Test;

/*
* 1. 定义一个测试类（测试用例）
*       测试类名：被测试的类名Test
*       包名：xxx.xxx.test
* 2. 定义测试方法：可以独立运行
*       方法名：test测试方法名
*       返回值：void
*       参数列表：空参
* 3.给方法加@Test
* 4.导入依赖环境
* 判定：红色失败 不关注输出结果,一般使用断言操作判断逻辑结果是否正确 Assert.assertEquals(3,result);
 * */
import javaCase.demo0327.JunitTest.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test; //需要导入

public class CalculatorTest {
    /*
    * 初始化方法：用于资源申请,所有测试方法执行之前都会执行该方法
    * */
    @Before
    public void init(){
        System.out.println("init.....");
    }
    /*
    * 释放资源方法：所有测试方法执行结束(就算异常也会执行），都会执行该方法*/
    @After
    public void close(){
        System.out.println("closing...");
    }
    /*
    * 测试add方法
    * */
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1,2);
        //断言
        Assert.assertEquals(3,result);
    }
    @Test
    public void testDiv(){
        Calculator c = new Calculator();
        int result = c.div(1,2);
        //断言
        Assert.assertEquals(0,result);
    }
}
