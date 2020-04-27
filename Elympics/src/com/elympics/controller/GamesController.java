package com.elympics.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elympics.bean.Gioco;
import com.elympics.bean.RigaClassifica;
import com.elympics.bean.RigaClassificaVO;
import com.elympics.bean.User;
import com.elympics.manager.ClassificaManager;

@Controller
public class GamesController {
	@RequestMapping("/games")
	public String games()
	{
		return "games";
	}	
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		ClassificaManager manager = new ClassificaManager();

		Gioco gioco = new Gioco();
		//prima riga 
	    gioco.setId(1);
		RigaClassificaVO r = manager.getPrimoClassificatoVO(gioco);
		m.addAttribute("primaRiga", r);
		//seconda riga 
		gioco.setId(2);
		RigaClassificaVO r2 = manager.getPrimoClassificatoVO(gioco);
		m.addAttribute("secondaRiga", r2);
		//terza riga 
		gioco.setId(3);
		RigaClassificaVO r3 = manager.getPrimoClassificatoVO(gioco);
		m.addAttribute("terzaRiga", r3);
		//quarta riga 
		gioco.setId(4);
		RigaClassificaVO r4 = manager.getPrimoClassificatoVO(gioco);
		m.addAttribute("terzaRiga", r4);
		return "home";
	}	
	@PostMapping("/salvapartita")
	public String salvaPartita(HttpSession session, @RequestParam("gioco") int gioco, @RequestParam("punteggio") int punteggio, Model m)
	{
		User u= (User) session.getAttribute("user");//se u null allora utente non loggato, rimando alla pagina di errore, per salvare serve login se u non null allora si richiama partitaManager che crea la partita con i dati
		if(u==null) {
			String msg="Sorry only logged players can save the game and be ranked";
			m.addAttribute("message", msg);
			return "errorpage";								
		}
		ClassificaManager manager = new ClassificaManager();
		try {
			manager.salvaPartita(u, gioco, punteggio);
		} 
		catch (Exception e) {
			m.addAttribute("message", e.getMessage());
			e.printStackTrace();
			return "errorpage";		
		}
		//int id_gioco=3;
		//Date data= new Date();
		System.out.println(u+"   "+gioco+"    "+punteggio);
			return "g"+gioco;
	}	
}

