package com.cn.ek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.ek.model.User;
import com.cn.ek.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public String add(User user){
		
		userService.add(user);
		System.out.println("OK");
		return "redirect:/user/list";
	}
	@RequestMapping(method=RequestMethod.GET,value="/list")
	public String list(){
		
		System.out.println("OK");
		return "list";
	}
	
}
