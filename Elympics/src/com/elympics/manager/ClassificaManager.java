package com.elympics.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.elympics.bean.Gioco;
import com.elympics.bean.RigaClassifica;
import com.elympics.bean.RigaClassificaVO;
import com.elympics.bean.RigaMedagliereVO;
import com.elympics.bean.User;
import com.elympics.dao.GiocoDAO;
import com.elympics.dao.GiocoHBDAO;
import com.elympics.dao.PartitaDAO;
import com.elympics.dao.PartitaHBDAO;
import com.elympics.dao.UserDAO;
import com.elympics.dao.UserHBDAO;

public class ClassificaManager {
	public RigaClassifica getPrimoClassificato(Gioco gioco) {
		PartitaDAO dao = new PartitaHBDAO();
		List<RigaClassifica> result = dao.getClassifica(gioco);
		return (result != null && result.size()>0)? result.get(0) : null;
	}
	
	public RigaClassificaVO getPrimoClassificatoVO(Gioco gioco) {
		PartitaDAO dao = new PartitaHBDAO();
		List<RigaClassifica> result = dao.getClassifica(gioco);	
		if(result != null && result.size()>0) {
			RigaClassifica riga = result.get(0);
			RigaClassificaVO vo = new RigaClassificaVO();
			//recupero del gioco
			GiocoDAO giocoDao = new GiocoHBDAO();
			Gioco g = giocoDao.get(gioco.getId());
			vo.setGioco(g);
			//recupero utente
			UserDAO userDao = new UserHBDAO();
			User u = userDao.get(riga.getUtente());
			vo.setUser(u);
			vo.setPunti(riga.getPunteggio());
			
			return vo;
		}
		return null;
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
	/*
	public List<RigaMedagliereVO> getMedagliere(List<RigaClassifica> classifica) {
		//ritorna una lista di RigaMedagliereVO
		//per ogni gioco : 
			//prelevo i primi 3 classificati	
			//per ogni classificato :
				//leggo il paese e incremento il numero di medaglie
		//id dell'utente è 1: 
		List<RigaMedagliereVO> medagliere;
        User u = classifica.get(0);
        String paese = u.getPaese(); // "Italia"
        RigaMedagliereVO mr = null; 
        
        return medagliere;
	}
	*/
}
