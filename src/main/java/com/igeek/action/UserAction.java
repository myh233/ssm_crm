package com.igeek.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igeek.bean.User;
import com.igeek.mapper.UserMapper;
import com.igeek.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
@Controller
public class UserAction {

	@Autowired
	UserService userService;

	@Test
	public void test1() {
		System.out.println("第一次查询");
		User user = userService.findById("111");
		System.out.println("第二次查询");
		User user2 = userService.findById("111");
		System.out.println(user);
	}
}
