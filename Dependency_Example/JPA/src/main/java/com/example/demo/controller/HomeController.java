package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserRepo;

@Controller
public class HomeController {

@Autowired
UserRepo urep;


@RequestMapping("/")
public String index()
{
	return "index";
}

@RequestMapping("nav")
public String nav()
{
	return "navbar";
}
@RequestMapping("reg")
public String register()
{
	return "signup";
}

@RequestMapping("regproc")
public String regProcess(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("phone")String phno,@RequestParam("password")String pass,ModelMap model)
{
	User u=new User();
	u.setName(name);
	u.setEmail(email);
	u.setPhno(phno);
	u.setPassword(pass);
	urep.save(u);
	model.put("msg", "Sucessfully Added!");
	return "signup";
}
}
