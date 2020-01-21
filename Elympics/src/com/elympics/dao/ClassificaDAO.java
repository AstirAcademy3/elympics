package com.elympics.dao;

import java.util.ArrayList;
import java.util.List;


import com.elympics.bean.*;
import com.elympics.bean.User;


public class ClassificaDAO {

	public List<Classifica> getListClassifica(){
		List<Classifica> lista = new ArrayList <Classifica>();
		for ( int i=0; i<=10; i++){
			User u = new User();
			Classifica c = new Classifica();
			u.setNome("provaNome" + i);
			u.setCognome("provaCognome" + i);
			c.setUser(u);
			c.setPunti(20-2*i);
			lista.add(c);
		}
		return lista;
	}
	public  Classifica getClassifica(User user) {
    	return new Classifica(user, 17);
	}
}
