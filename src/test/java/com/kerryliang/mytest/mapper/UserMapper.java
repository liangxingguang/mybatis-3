package com.kerryliang.mytest.mapper;

import com.kerryliang.mytest.bean.User;

import java.util.List;

public interface UserMapper {

    int save(User user);
    List<User> getUsers();
}
