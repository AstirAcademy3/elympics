package com.elympics.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elympics.bean.User;
import com.elympics.manager.UserManager;

@Controller
public class UserController {

	@RequestMapping("/login")
	//read the provided form data
	public String display(@RequestParam("username") String username,@RequestParam("password") String password,Model m)
	{
		UserManager manager = new UserManager();
		User user = null;
		try {
			user = manager.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
			m.addAttribute("message", e.getMessage());
			return "errorpage";
		}
		if(user!=null)
		{
			String msg="Hello "+ user.getNome() + " " + user.getCognome();
			//add a message to the model
			m.addAttribute("message", msg);
			return "viewpage";
		}
		else
		{
			String msg="Sorry "+ username +". You entered an incorrect password or username";
			m.addAttribute("message", msg);
			return "errorpage";
		}	
	}
}
