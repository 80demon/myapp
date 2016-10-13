package com.panjoy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.panjoy.domain.Account;

@Controller
@RequestMapping("/user")
public class ModelAttrController {
	private static List<Account> accounts=new ArrayList<Account>();
	{
		Account ac1=new Account();
		Account ac2=new Account();
		ac1.setUsername("pan");
		ac1.setPassword("joy");
		ac2.setUsername("test");
		ac2.setPassword("123");
		accounts.add(ac2);
		accounts.add(ac1);
	}
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		System.out.println("demo1");
		return "/user/demo1";
		
	}
	@ModelAttribute("accounts")
	public List<Account> getAccounts(){
		return accounts;
		
	}
}
