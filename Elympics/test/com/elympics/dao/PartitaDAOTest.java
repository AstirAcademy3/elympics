package com.elympics.dao;

import java.util.Date;
import java.util.List;

import com.elympics.bean.Partita;
import com.elympics.bean.User;

public class PartitaDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitaDAO dao= new PartitaHBDAO();
		//Partita u= getPartitaTest();
		try {
			//dao.AddPartita(u);
			List<Partita> partita= dao.getAll();
			//dao.DeletePartita(Partita);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*private static Partita getUserTest() {
		User user = new User();
		Date data = new Date(System.currentTimeMillis());
		  System.out.println("inserire username :");
		  user.setUsername("username");
		  user.setNome("nome");
		  user.setCognome("cognome");
		  user.setMail("mail");
		  user.setPassword("password");
		  user.setPaese("paese");			  
		  user.setCreazione(data);
		  return user;
	}
	*/
	}


