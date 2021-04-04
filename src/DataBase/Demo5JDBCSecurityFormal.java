package javaCase.demo0327.DataBase;

import java.sql.*;
import java.util.Scanner;

/*
PreparedStatement：
    Statement的子类，可以解决sql注入的问题
    预编译的sql:参数使用？作为占位符
    后期都会使用PreparedStatement来完成增删改查所有操作
    步骤：
        1.导入驱动jar包 add as library
    *   2.注册驱动
                ------------------------使用JDBC工具类完成
    *   3.获取数据库连接对象
    *   4.定义sql
                ------------------------sql参数使用？作为占位符
    *   5.获取sql执行对象
                ------------------------pstmt = conn.prepareStatement(sql);
    *   6.给？赋值
                ------------------------pstmt.setString(?的位置编号 从1开始，？的值);两个参数
        7.执行sql
                ------------------------rs = pstmt.executeQuery() 无需传参
    *   7.释放资源
                ------------------------使用JDBC工具类完成DemoJDBCUtils.close(pstmt,conn,rs);
* */
public class Demo5JDBCSecurityFormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        boolean login = login(username, password);
        if(login){
            System.out.println("登陆成功");
        }else{
            System.out.println("用户名或者密码错误");
        }

    }
    public static boolean login(String username,String password){
        if(username==null || password==null){
            return false;
        }
        Connection conn = null;
        /*Statement stmt = null;*/
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            conn = DemoJDBCUtils.getConnection();
            String sql = "select * from user where username=? and password=?";
            pstmt = conn.prepareStatement(sql);
            //给占位符赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            /*stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);*/

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //DemoJDBCUtils.close(stmt,conn,rs);
            DemoJDBCUtils.close(pstmt,conn,rs);
        }

        return false; //忘记了会报错

    }
}
