package javaCase.demo0327.DataBase;

import java.util.List;
import java.util.Map;

/*
* spring 框架对JDBC的简单封装，提供了一个JDBCTemplate对象简化开发
* 步骤：
*    1.导入jar包
*   2.创建JdbcTemplate对象，依赖于数据源DataSource
*           JdbcTemplate template = new JdbcTemplate(ds);
*   3.调用JdbcTemplate方法完成CRUD操作
*       update():DML
*           返回int 类型 影响的行数
*
*       queryForMap():查询结果封装为map集合
*           注意：这个方法只能查询结果集长度为1的!!!!!
*
*       queryForList():查询结果封装为list集合
*           注意：将每一条记录封装为map集合，再将map集合封装成list集合
*
*       query():查询结果，将结果封装为javaBean
*           List<Emp> template.query(sql,new BeanPropertiesRowMapper<Emp>(Emp.class));
*           注意把类中的成员变量数据类型设置为包装类、属性名和列名必须完全一样
*           参数：RowMapper
*                一般使用BeanPropertiesRowMapper实现类，可以完成数据到JavaBean的自动封装
*               new BeanPropertiesRowMapper(类名.clasee)
*       queryForObject():查询结果封装为对象
*           一般用来执行聚合函数
*
*  注意：
*       自动会创建connection、statement最后释放资源 无需自己写代码
*       只需要创建template对象、写sql、执行sql
*
* */
public class Demo8JDBCTemplate {
    public static void main(String[] args) {
        /*JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update account set balance=100 where id=?";
        int count = template.update(sql,3);
        System.out.println(count);*/

        //常用：查询所有记录 queryForList
        /*String sql = "select * from account";
        List<Map<String,Object>> list = template.queryForList(sql);*/


        //常用：查询所有记录，并将其封装为Account对象的List集合  query
        /*String sql = "select * from account";
        List<DemoAccount> list = template.query(sql,new BeanPropertiesRowMapper<DemoAccount>(DemoAccount.class));
        for (DemoAccount demoAccount : list) {
            System.out.println(demoAccount);
        }*/

        //常用：查询总记录数量queryForObject()
        /*String sql = "select count(id) from account";
        Long total = template.queryForObject(sql,Long.class);*/




    }
}
