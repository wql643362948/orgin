package com.wql.service;



import com.wql.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(int id);
}
