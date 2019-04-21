package com.kerryliang.mytest.mysql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisTest {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("com/kerryliang/mytest/mysql/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        User user = new User();
        user.setName("admin");
        user.setSex("男");
        user.setAge(26);


        session.insert("com.kerryliang.mytest.mysql.UserMapper.save", user);
        session.commit();
        session.close();
    }
}
