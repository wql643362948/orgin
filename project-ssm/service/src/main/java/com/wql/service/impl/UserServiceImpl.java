package com.wql.service.impl;

import com.wql.dao.IUserDao;
import com.wql.pojo.User;
import com.wql.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl  implements IUserService {

    @Autowired
    private IUserDao userDao;
    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(int id) {
        return userDao.findById(id);
    }
}
