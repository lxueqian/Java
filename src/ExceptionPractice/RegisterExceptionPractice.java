package javaCase.demo0327.ExceptionPractice;

import java.util.Scanner;

/*模拟注册操作，如果用户名已经存在，则抛出异常并提示
*   1.数组保存已经注册过的用户名（数据库）
*   2.Scanner获取输入
*   3.循环判断用户输入注册名是否存在，若存在抛出注册异常*/
public class RegisterExceptionPractice {
    static String[] usernames = {"aaa","bbb","ccc","ddd"};

    public static void main(String[] args) throws DemoRegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册名：");
        String s = sc.next();
        checkUserName(s);
    }
    /*首先、==是判断两个变量或实例是不是指向同一个内存空间
    equals是判断两个变量或实例所指向的内存空间的值是不是相同
    其次、==是指对内存地址进行比较 equals()是对字符串的内容进行比较
    最后、==指引用是否相同 equals()指的是值是否相同 */
    /*public static void checkUserName(String s) throws DemoRegisterException {
        for (String username : usernames) {
            if(username.equals(s)){
                throw new DemoRegisterException("该用户名已经被注册");
            }
        }
        System.out.println("注册成功");
    }*/

    //try...catch处理
    public static void checkUserName(String s) {
        for (String username : usernames) {
            if(username.equals(s)){
                try {
                    throw new DemoRegisterException("该用户名已经被注册");
                } catch (DemoRegisterException e) {
                    e.printStackTrace();
                    return; //必须
                }
            }
        }
        System.out.println("注册成功");
    }

    //如果DemoRegisterException继承RuntimeException可以不处理
    /*public static void checkUserName(String s) {
        for (String username : usernames) {
            if (username.equals(s)) {
                throw new DemoRegisterException("该用户名已经被注册");
            }
        }
        System.out.println("注册成功");
    }*/
}
