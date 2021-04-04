package javaCase.demo0327.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* 事务：一个包含多个步骤的业务操作，如果这个业务操作被事务管理，则多个步骤要么同时成功
*       要么同时失败
* 操作：
*      1.开启事务
*      2.提交事务
*      3.回滚事务
* 使用Connection对象来管理事务
*      开启事务：conn.setAutoCommit() 执行sql之前开启事务
*      提交事务：conn.commit()  所有sql都执行完提交事务
*      回滚事务：conn.rollback() catch中回滚
*
* 转账练习
* */
public class Demo6JDBCShiWu {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            conn = DemoJDBCUtils.getConnection();
            //开启事务手动提交
            conn.setAutoCommit(false);

            String sql1 = "update account balance = balance-? where id=?";
            String sql2 = "update account balance = balance+? where id=?";

            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);

            pstmt1.setDouble(1,500);
            pstmt1.setDouble(2,1);

            pstmt2.setDouble(1,500);
            pstmt2.setDouble(2,2);

            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            //提交事务
            conn.commit();

        } catch (Exception e) {
            //回滚
            if(conn!=null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            DemoJDBCUtils.close(pstmt1,conn);
            DemoJDBCUtils.close(pstmt2,null);
        }

    }
}
