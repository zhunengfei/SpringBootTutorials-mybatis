package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.model.User;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

  int deleteByPrimaryKey(Integer userId);

  int insert(User record);

  int insertSelective(User record);

  User selectByPrimaryKey(Integer userId);

  List<User> selectAllUser();

  int updateByPrimaryKeySelective(User record);

  int updateByPrimaryKey(User record);
}