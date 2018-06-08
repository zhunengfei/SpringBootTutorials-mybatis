package com.example.springbootmybatisdemo.service;

import com.example.springbootmybatisdemo.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

  int addUser(User user);

  PageInfo<User> findAllUser(int pageNum, int pageSize);
}

