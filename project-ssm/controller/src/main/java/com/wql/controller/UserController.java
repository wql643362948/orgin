package com.wql.controller;

import com.wql.pojo.User;
import com.wql.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(value = "/user", tags = "用户接口",description = "用户接口")
public class UserController {
    private static Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService userService;


    @ApiOperation(value = "获取全部用户列表", notes = "获取全部用户列表", httpMethod = "GET", response = User.class)
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/findById/{id}")
    @ApiOperation(value = "获取单个用户", notes = "获取单个用户", httpMethod = "GET", response = User.class)
    public User findById(@PathVariable("id") int id){
        return userService.findById(id);
    }
}
