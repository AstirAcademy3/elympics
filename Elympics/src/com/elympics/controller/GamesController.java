package com.elympics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elympics.bean.Gioco;
import com.elympics.bean.RigaClassifica;
import com.elympics.bean.RigaClassificaVO;
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
}

