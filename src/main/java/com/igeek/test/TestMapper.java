package com.igeek.test;

import com.igeek.bean.User;
import com.igeek.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMapper {

	@Autowired
	UserMapper userMapper;

	@Test
	public void test1() {
		System.out.println("第一次查询");
		User user = userMapper.findById("111");
		System.out.println("第二次查询");
		User user2 = userMapper.findById("111");
		System.out.println(user);
	}
}
