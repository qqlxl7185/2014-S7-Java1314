package com.demo.org.service.impl;

import org.springframework.stereotype.Service;

import com.demo.org.bean.Account;
import com.demo.org.service.IAccountService;

@Service("accountService")
public class AccountServiceImpl implements IAccountService{

	@Override
	public Account getAccount(int id) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.setUsername("testusername");
		acc.setPassword("testpassword");
		
		return acc;
	}

}
