package com.kerryliang.mytest.mysql;

import com.kerryliang.mytest.bean.User;
import org.junit.jupiter.api.Test;

import java.util.List;

 class MyBatisTest extends BaseMapperTest {
    @Test
    void testSelect() throws Exception {
        List<User> userList = sqlSession.selectList("com.kerryliang.mytest.mapper.UserMapper.getUsers");
    }

    @Test
    void testInsert() throws Exception {
        User user = new User();
        user.setName("liangxingguang");
        user.setSex("男");
        user.setAge(26);
        sqlSession.insert("com.kerryliang.mytest.mapper.UserMapper.save", user);
    }
}
