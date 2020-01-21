package com.elympics.manager;

import java.util.Collections;
import java.util.List;


import com.elympics.bean.User;
import com.elympics.bean.*;
import com.elympics.dao.ClassificaDAO;
import com.elympics.dao.UserDAO;
import com.google.common.collect.Lists;



public class UserManager {
	
	UserDAO dao= new UserDAO();
	
	public User getUser (String username, String password){
	return dao.getUser(username, password);
	}
	
	public boolean existUsername (String username){
	User u1= dao.getUser(username);
	return (u1!=null)?true:false;
	}
	
	public void bloccaUser (String username){
	dao.bloccaUser(username);
}
	ClassificaDAO cdao = new ClassificaDAO();
	
	public  List<Classifica> getListClassifica() {
		return cdao.getListClassifica();
	}
	public List<Classifica> getListaPrimiTre(User user){
		Classifica cuser = cdao.getClassifica(user);
		List<Classifica> l = cdao.getListClassifica();
		l.add(cuser);		
		Collections.sort(l);
		List<List<Classifica>> p = Lists.partition(l, 3);
		List<Classifica> primi = p.get(0);
		if(!primi.contains(cuser)) {
			primi.add(cuser);
		}
		return primi;
	}

	}


