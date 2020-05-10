package com.kerryliang.mytest.mysql;

import com.kerryliang.mytest.bean.SysUser;
import com.kerryliang.mytest.mapper.SysUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class SysUserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectById() {
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser sysUser = mapper.selectById(1L);
    }
}
