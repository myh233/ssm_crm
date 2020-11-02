package com.igeek.mapper;

import org.springframework.stereotype.Repository;

import com.igeek.bean.User;

@Repository
public interface UserMapper {
    //查询
    public User findById(String uid);
}
