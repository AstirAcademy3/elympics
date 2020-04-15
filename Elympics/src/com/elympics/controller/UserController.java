package com.elympics.controller;
import java.util.Date;

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
	@RequestMapping("/registrazione")
	//read the provided form data
	public String registrazione()
	{
		return "registrati";
	}
	@RequestMapping("/aboutus")
	//read the provided form data
	public String aboutus()
	{
		return "aboutus";
	}
	@RequestMapping("/rank")
	//read the provided form data
	public String rank()
	{
		return "rank";
	}

	@RequestMapping("/registra")
	//read the provided form data
	public String creazione(@RequestParam("nome") String nome,@RequestParam("cognome") String cognome,
			@RequestParam("username") String username,@RequestParam("password") String password,
			@RequestParam("email") String email,Model m)
	{
		Date data = new Date();
		UserManager manager = new UserManager();
		User user = new User();
		user.setNome(nome);
		user.setCognome(cognome);
		user.setCreazione(data);
		user.setUsername(username);
		user.setPassword(password);
		user.setMail(email);
		try {
			 manager.crea(user);
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
			String msg="Sorry some fileds that you insert are wrong";
			m.addAttribute("message", msg);
			return "errorpage";
		}	
	}
}