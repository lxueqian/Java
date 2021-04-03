package javaCase.demo0327.DataBase;
/*
* 数据库软件：
*   oracle mysql sqlserver(微软) db2(银行、IBM） SyBase(PowerDesigner 数据建模）
*
* Mysql
*   卸载时注意:删掉软件后需要找到隐藏文件夹里面的C:\ProgramData\MySQL
*           否则无法成功重新安装
*       1.mysql安装目录找到my.ini datadir 2.卸载mysql 3.删除C:\ProgramData\MySQL目录
*   root root
*
* Mysql服务
*       1.服务启动 手动；cmd->services.msc打开服务窗口；管理员cmd net start/stop mysql
*       2.连接数据库 cmd -> mysql -uroot -p密码(root) // mysql -hip地址 -uroot -p连接目标的密码
*       3.退出数据库 cmd -> exit//quit
*
* Mysql目录结构
*      Mysql服务器：硬件+软件
*      安装目录：my.ini配置文件
*      数据目录：frm是表 数据库->文件夹 表->文件
* SQL：
*   1.定义：结构化查询语言
*   2.通用语法：
*       1）以分号结尾
*       2）不区分大小写
*       3）三种注释：单行注释：--(空格) 或 #
*                   多行注释：
    3.分类：
    *   DDL 操作数据库、表 create drop alter
    *       create database if not exists db4 character set gbk;
    *       show databases;
    *       show create database db5;
    *       alter database db4  character set 字符集名称;
    *       drop database if exists db4;
    *       select database();查询当前使用的数据库名
    *       use db4;使用数据库
    *
    *   DML 增删改表 insert delete update
    *       show tables;
    *       desc tb1; 查询表结构
    *   DQL 查询表 select where
        DCL 授权 grant revoke

    *
 */


public class DemoDB {

}
