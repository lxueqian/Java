package javaCase.demo0327.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
* create table user(
*   id int primary key auto_increment,
*   username varchar(20),
*   password varchar(20)
* );
* insert into user values(null,'zhangsan','123');
* insert into user values(null,"lisa",'945');
*
*   */
public class Demo4JDBCLogin {
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
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DemoJDBCUtils.getConnection();
            String sql = "select * from user where username='"+username+"' and password='"+password+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DemoJDBCUtils.close(stmt,conn,rs);
        }

        return false; //忘记了会报错

    }
}