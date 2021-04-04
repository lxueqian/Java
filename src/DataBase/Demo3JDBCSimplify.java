package javaCase.demo0327.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
* 通过JDBC工具类简化书写
* */
public class Demo3JDBCSimplify {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            conn = DemoJDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from account";
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
            DemoJDBCUtils.close(stmt,conn,resultSet);
        }


    }
}
