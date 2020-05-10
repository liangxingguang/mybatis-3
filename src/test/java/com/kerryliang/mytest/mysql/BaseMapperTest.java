package com.kerryliang.mytest.mysql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.io.Reader;

public class BaseMapperTest {

    private static SqlSessionFactory sqlSessionFactory;

    protected static SqlSession sqlSession;

    @BeforeAll
    protected static  void init() {
        try {
            Reader reader = Resources.getResourceAsReader("resources/mapper/xml/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    protected static void end() {
        if (sqlSession != null) {
            sqlSession.commit();
            sqlSession.close();
        }
    }

}
