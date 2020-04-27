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
public class PartitaController {	

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
			//return "g"+gioco;
			return "redirect:/gioco?id="+gioco;
	}	
}

