package javaCase.demo0327.DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
* JDBC：java的数据库连接，定义了一套操作所有关系型数据库的规则（接口），各个厂商实现接口，提供数据库驱动
* jar包，我们可以使用这套接口编程，真正执行的代码时驱动jar包中的实现类
*
* 入门：
*   1.导入驱动jar包 add as library
*   2.注册驱动
*   3.获取数据库连接对象
*   4.定义sql
*   5.获取sql执行对象
*   6.执行sql
*   7.释放资源
    *
* */
public class Demo2JDBC {
    public static void main(String[] args) {
        /*一.注册驱动
            1.其实就是把字节码文件加载进内存，类的静态代码块自动注册驱动
            2.可以省略,驱动中有一个文件可以自动注册
        */

        //Class.forName("com.mysql.jdbc.Driver");

        /*
        二.数据库连接对象 Connection
            static Connection getConnection()   eg:DriverManager.getConnection(url,user,pass)
            url:jdbc:mysql://ip地址（域名）:短口/数据库名称
            技巧：jdbc:mysql://localhost:3306/db 可以简写为jdbc:mysql:///db

            功能：
                1.获取执行sql对象
                    Statement createStatement()
                    PreparedStatement PreparedStatement(String sql)
                2.管理事务：
                    开启事务： void setAutoCommit(boolean a)调用该方法设置参数为false就是开启事务
                    提交事务： commit()
                    回滚事务： rollback()

         */
        Connection connection = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/db", "root", "root");


            //String sql = "insert into account values(1,'李四',200)";
            //String sql = "update account set balance=500 where id=1";
            String sql = "select * from account";

        /*
        * 三. Statement执行sql对象：
        *   boolean execute(String sql):可以执行任意sql
        *   int executeUpdate(String sql):(库表级别)执行DML(insert/update/delete)、DDL(create/alter/drop)
        *   返回值：影响的行数，或者没有返回值
        *           可以通过行数判断语句执行是否成功
        *   ResultSet executeQuery(String sql)：执行DQL语句(select)
        */
        /*
        * 四. ResultSet:结果集对象，封装查询结果
        *   boolean next()：游标移动一行,判断当前行是否是最后一行末尾 是返回false 有数据则返回true
        *   getXxx(参数):获取数据
        *       1.Xxx:代表数据类型 eg:int getInt()
        *       2.参数： int 列的编号 从1开始
        *               String 列名称
        *
        * */

            stmt = connection.createStatement();

            //返回int
           /* int count = stmt.executeUpdate(sql);
            System.out.println(count);*/

            //resultSet 遍历结果集
            resultSet = stmt.executeQuery(sql);
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble(3);
                System.out.println(id+"--"+name+"---"+balance);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            /*
             * 释放资源可以在finally里面释放，注意判断stmt是否为null
             * */
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
