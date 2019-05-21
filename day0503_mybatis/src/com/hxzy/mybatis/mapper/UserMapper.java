package com.hxzy.mybatis.mapper;

import com.hxzy.mybatis.pojo.User;

public interface UserMapper {
	
	public User findUserById(Integer id);
	
	public void insertUser(User user);
	
	public void updateUserById(User user); 

}
