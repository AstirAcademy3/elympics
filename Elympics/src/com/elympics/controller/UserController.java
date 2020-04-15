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
		UserManager manager= new UserManager();
		User utente;
		try {
			utente = manager.login(username,password);
		} catch (Exception e) {
			m.addAttribute("message", e.getMessage());
			return "registrati";
		}
		if(utente!= null)
		{
			String msg="Hello "+ utente.getNome();
			//add a message to the model
			m.addAttribute("message", msg);
			return "home";
		}
		else
		{
			String msg="Credenziali errate";
			m.addAttribute("message", msg);
			return "registrati";
		}	
	}
	@RequestMapping("/index")
	//read the provided form data
	public String index()
	{
		return "login";
	}
}	
