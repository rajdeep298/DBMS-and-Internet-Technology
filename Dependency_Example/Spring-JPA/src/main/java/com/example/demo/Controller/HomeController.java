package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	UserRepo urepo;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/registerprocess")
	public String registerprocess(@RequestParam("uname") String name, @RequestParam("uemail") String email, @RequestParam("uphno") String phno, @RequestParam("upass") String password, ModelMap model) {
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhno(phno);
		user.setPassword(password);
		urepo.save(user);
		model.put("msg", "User registered successfully");
		return "register";
	}
	
	@RequestMapping("/loginprocess")
	public String loginprocess(@RequestParam("uemail") String email, @RequestParam("upass") String password,ModelMap model,HttpSession session) {

		User user = null;
		user = urepo.findByEmailAndPassword(email, password);
		if (user != null) {
			session.setAttribute("data", email);
			return "index";
		}
		else {
			model.put("msg", "Invalid email or password");
			return "login";
		}
		
	}
	
	@RequestMapping("/profileprocess")
	public String profileprocess(@RequestParam("uname") String name, @RequestParam("uemail") String email,
			@RequestParam("uphno") String phno, @RequestParam("upass") String password, ModelMap model,
			HttpSession session) {

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhno(phno);
		user.setPassword(password);
		urepo.save(user);
		session.setAttribute("data", user);
		model.put("msg", "Profile updated successfully");
		return "profile";
	}
}
