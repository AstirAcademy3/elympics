package com.elympics.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.elympics.bean.*;
import com.elympics.dao.PartitaDAO;
import com.elympics.dao.PartitaHBDAO;
import com.elympics.dao.UserDAO;
import com.elympics.dao.UserFileDAO;
import com.elympics.dao.UserHBDAO;
//import com.google.common.collect.Lists;


public class UserManager {
	
	public void cancellaIscrizione(User user) throws Exception {
		UserDAO dao= new UserHBDAO();
		user.setEliminazione(new Date());
		dao.modifica(user);
	}
	public RigaClassifica getPrimoClassificato(Gioco gioco) {
		PartitaDAO dao = new PartitaHBDAO();
		List<RigaClassifica> result = dao.getClassifica(gioco);
		return (result != null && result.size()>0)? result.get(0) : null;
	}
	public List<RigaClassifica> getListaClassifica(Gioco gioco){
		PartitaDAO dao = new PartitaHBDAO();
		return dao.getClassifica(gioco);
	}
	
	public List<RigaClassifica> getListaPrimiTre(User user, Gioco gioco){
		PartitaDAO dao = new PartitaHBDAO();
		List<RigaClassifica> classifica = dao.getClassifica(gioco);
		Collections.sort(classifica);
		List<RigaClassifica> risultato = new ArrayList<RigaClassifica>();
		if(classifica!=null && classifica.size() > 3) {
			risultato.add(classifica.get(0));
			risultato.add(classifica.get(1));
			risultato.add(classifica.get(2));
			for(int i = 3; i<classifica.size(); i++) {
				if(user.getId()==classifica.get(i).getUtente()) {
					risultato.add(classifica.get(i));
					return risultato;
				}
			}
			return risultato;
		}else {
			return classifica;
		}		
	}
	public List<RigaClassifica> getClassificaCompleta(Gioco gioco){
		PartitaDAO dao = new PartitaHBDAO();
		List<RigaClassifica> classifica = dao.getClassifica(gioco);
		Collections.sort(classifica);
		return classifica;
	}
	public User login(String username, String password) throws Exception {
		UserDAO dao= new UserHBDAO();
		
		return dao.login(username, password);
	}
	public void crea(User user) throws Exception {
		UserDAO dao= new UserHBDAO();
		dao.crea(user);
	}
}