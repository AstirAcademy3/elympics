package com.elympics.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			if(user!=null) {
				for(int i = 3; i<classifica.size(); i++) {
					if(user.getId()==classifica.get(i).getUtente()) {
						risultato.add(classifica.get(i));
						return risultato;
					}
				}
			}
			return risultato;
		}else {
			return classifica;
		}		
	}

	public Collection<RigaMedagliereVO> getMedagliere() {
		Map<String,RigaMedagliereVO> medagliere= new HashMap<String,RigaMedagliereVO>();
		
			for(int i=1;i<=4;i++) {
				GiocoDAO giocoDao = new GiocoHBDAO();
				Gioco g = giocoDao.get(i);
				RigaMedagliereVO riga=null;
				List<RigaClassifica> classifica= this.getListaPrimiTre(null,g);
				
				
				
				UserDAO userDao = new UserHBDAO();
				for(int j=0;j<classifica.size();j++){
					
				
					User u = userDao.get(classifica.get(j).getUtente());
					
			       if (medagliere.get(u.getPaese())==null) {
			        	riga = new RigaMedagliereVO();
			        	riga.setPaese(u.getPaese());
			            medagliere.put(u.getPaese(),riga);
			        }
				
		    	   riga = medagliere.get(u.getPaese());
		    	   switch (j) {
		    		   case 0:riga.incrementaOro(); break;
		    		   case 1:riga.incrementaArgento();break;
		    		   case 2:riga.incrementaBronzo();break;
		    	   }
				}	
		}
	        return medagliere.values();
	}
}
