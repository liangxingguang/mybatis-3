package com.kerryliang.mytest.mapper;

import com.kerryliang.mytest.bean.SysUser;

public interface SysUserMapper {
    SysUser selectById(Long id);
}
