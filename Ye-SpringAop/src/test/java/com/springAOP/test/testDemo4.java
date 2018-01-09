package com.springAOP.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springAOP.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-tx.xml")
public class testDemo4 {

	@Autowired
	IAccountService accountService; 
	
	@Test
	public void test1(){
		accountService.transfer(1, 2, 100.0);
	}

}