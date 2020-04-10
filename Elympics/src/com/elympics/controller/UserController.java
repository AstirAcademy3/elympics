package com.elympics.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elympics.bean.User;
import com.elympics.manager.UserManager;

@Controller
public class UserController {

	@RequestMapping("/hello")
	//read the provided form data
	public String display(@RequestParam("username") String username,@RequestParam("password") String password,Model m)
	{
		UserManager manager = new UserManager();
		
		try {
			User user = manager.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
			m.addAttribute("message", e.getMessage());
			return "errorpage";
		}
		if(password.equals("admin"))
		{
			String msg="Hello "+ username;
			//add a message to the model
			m.addAttribute("message", msg);
			return "viewpage";
		}
		else
		{
			String msg="Sorry "+ username+". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorpage";
		}	
	}
}
