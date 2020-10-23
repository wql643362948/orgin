package com.wql.dao;



import com.wql.pojo.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();

    User findById(int id);
}
