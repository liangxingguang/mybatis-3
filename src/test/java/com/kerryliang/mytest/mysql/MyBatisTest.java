package com.kerryliang.mytest.mysql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

 class MyBatisTest {

    @Test
    void testSelect() throws Exception {
        SqlSession session = getSqlSession();
        List<User> userList = session.selectList("com.kerryliang.mytest.mysql.UserMapper.getUsers");
        closeSqlSession(session);
    }

    @Test
    void testInsert() throws Exception {
        User user = new User();
        user.setName("liangxingguang");
        user.setSex("男");
        user.setAge(26);

        SqlSession session = getSqlSession();
        session.insert("com.kerryliang.mytest.mysql.UserMapper.save", user);
        closeSqlSession(session);
    }

    private SqlSession getSqlSession() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("com/kerryliang/mytest/mysql/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    private void closeSqlSession(SqlSession session) {
        if (session != null) {
            session.commit();
            session.close();
        }
    }
}
