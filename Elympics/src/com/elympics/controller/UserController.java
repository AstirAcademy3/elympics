package com.elympics.controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elympics.bean.Gioco;
import com.elympics.bean.RigaClassifica;
import com.elympics.bean.RigaClassificaVO;
import com.elympics.bean.RigaMedagliereVO;
import com.elympics.bean.User;
import com.elympics.manager.ClassificaManager;
import com.elympics.manager.UserManager;

@Controller
@Scope("session")
public class UserController {

	@RequestMapping("/")
	//read the provided form data
	public String index()
	{
		System.out.println("Passaggio dalla index");
		return "home";
	}
	@RequestMapping("/login")
	//read the provided form data
	public String display(@RequestParam("username") String username,@RequestParam("password") String password,Model m, HttpSession session)
	{
		UserManager manager= new UserManager();
		User utente;
		try {
			utente = manager.login(username,password);
			session.setAttribute("user", utente);
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
	@RequestMapping("/logout")
	//read the provided form data
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "home";
	}
	@RequestMapping("/registrazione")
	//read the provided form data
	public String registrazione()
	{
		return "registrati";
	}
	@RequestMapping("/prelogin")
	//read the provided form data
	public String prelogin()
	{
		return "login";
	}
	@RequestMapping("/aboutus")
	//read the provided form data
	public String aboutus()
	{
		return "aboutus";
	}
	@RequestMapping("/rank")
	//read the provided form data
	public String rank(HttpSession session, Model m)
	{
		ClassificaManager cManager=new ClassificaManager();
		Collection<RigaMedagliereVO> medagliere = cManager.getMedagliere();
		m.addAttribute("medagliere", medagliere);
		
		User u= (User) session.getAttribute("user");
		if(u!=null) {
			UserManager manager = new UserManager();
			Gioco gioco = new Gioco();
			List<RigaClassificaVO> lrc = new ArrayList<RigaClassificaVO>();
			for(int i=1; i<=4; i++) {
			gioco.setId(i);
			RigaClassificaVO rc=manager.getPrimoClassificatoPerPaese(u, gioco);
			lrc.add(rc);
			}
			m.addAttribute("classificaPaese", lrc);
			return "rank";
		}else {
			String msg="Non hai effettuato il login non puoi veddere le classifiche!";
			m.addAttribute("message", msg);
			return"errorpage";
		}
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
			return "login";
		}
		else
		{
			String msg="Sorry some fileds that you insert are wrong";
			m.addAttribute("message", msg);
			return "errorpage";
		}	
	}
	@RequestMapping("/gioco2")
	   public String gioco1() {
			System.out.println("sono entrato nel controller di gioco1");
	      return "g1";
	   }
	@GetMapping("/gioco")
	public String getUser(@RequestParam("id") String id){

		return "g"+id;
	}
}