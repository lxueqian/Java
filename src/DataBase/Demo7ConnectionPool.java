package javaCase.demo0327.DataBase;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/*
* 1.数据库连接池:其实就是一个容器（集合），存放数据库连接的容器
*   系统初始化后，容器被创建，容器中会申请一些连接对象，当用户来访问数据库，从容器中获取连接对象，
*   用完后再把对象归还容器
* 2.好处：节约资源 用户访问高效
* 3.实现
*   1）标准接口 DataSource javax.sql包下
*       方法：getConnection()获取连接
*               conn.close() 归还连接：如果连接对象是从从连接池获取
*   2）由数据库厂商实现：C3P0数据库连接池技术  Druid数据库连接池技术Alibaba
* 4.C3P0
*   步骤：1）导入jar包(2个） mchange-commons-java-0.2.12.jar c3p0.jar
*        2）定义配置文件 名称c3p0.properties 或者c3p0-config.xml
*                       路径：放在src目录下即可
*        3）创建核心对象 数据库连接池对象 DataSource ds = new ComboPooledDataSource();
*        4）获取连接 Connection conn = ds.getConnection()
* 5.Druid
*   步骤：1）导入jar包
*         2）定义配置文件 properties形式 可以叫任意名称，放在任意目录下面
*            加载配置文件
*                Properties pro = new Properties();
                InputStream rs = Demo7ConnectionPool.class
                *               .getClassLoader()
                *               .getResourceAsStream("druid.pro");
                try {
                    pro.load(rs);
                } catch (IOException e) {
                    e.printStackTrace();
                }
*
*
*         3）获取数据库连接池对象：通过工厂来获取 DataSource ds = DruidDataSourceFactory.createDataSource(pro)
*         4）获取连接 Connection conn = ds.getConnection()
*   定义工具类：
*       1)定义一个类 JDBCUtils
*       2)提供静态代码块加载配置文件，初始化连接池对象
*       3)提供方法：
*           获取连接方法：通过数据库连接池获取
*           释放资源
*           获取连接池方法
*
* */
public class Demo7ConnectionPool {
    public static void main(String[] args) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(null,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"王五");
            pstmt.setString(2,"3000");
            System.out.println(pstmt.executeUpdate());

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,pstmt,conn);
        }

    }
}
