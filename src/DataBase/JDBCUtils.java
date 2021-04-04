package javaCase.demo0327.DataBase;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Properties;

/*
* Druid的工具类
* */
public class JDBCUtils {

    //定义成员变量
    private static DataSource ds;

    //加载配置文件并获取DataSource对象
    static {
        Properties pro = new Properties();
        InputStream rs = Demo7ConnectionPool.class.getClassLoader().getResourceAsStream("druid.pro");
        try {
            pro.load(rs);
            //没有导入jar包暂时注释
            //ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //释放资源
    public static void close(ResultSet rs, Statement stmt,Connection conn){
        if(rs!=null){
            try {
                rs.close();
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
        }if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //获取数据库连接池对象
    public static DataSource getDataSource(){
        return ds;
    }
}
