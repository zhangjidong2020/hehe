package com.hxzy.mybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hxzy.mybatis.mapper.UserMapper;
import com.hxzy.mybatis.pojo.User;

public class JunitTest {
	
	@Test
	public void test() {
		ApplicationContext  ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper=(UserMapper)ac.getBean("userMapper");
		User user=userMapper.findUserById(1);
		System.out.println(user);
	}

}
