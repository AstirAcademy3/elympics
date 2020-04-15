package com.elympics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GamesController {
	@RequestMapping("/games")
	//read the provided form data
	public String games()
	{
		
			return "games";
		}	
	
	}

