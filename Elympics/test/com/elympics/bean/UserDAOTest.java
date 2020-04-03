package com.elympics.bean;

import java.util.Date;

import com.elympics.dao.UserDAO;
import com.elympics.dao.UserHBDAO;



public class UserDAOTest {
	public static void main(String[] args) {
		UserDAO dao= new UserHBDAO();
		User u= getUserTest();
		try {
			dao.crea(u);
			User u2=dao.login(u.getUsername(), u.getPassword()+1);
			if(u2==null) {
				System.out.println("test ok: utente o password errati "+u.getPassword()+1);
			}
			User u3=dao.login(u.getUsername(), u.getPassword());
			if(u3!=null) {
				System.out.println("test ok: login e password corrette "+u.getPassword());
			}
			User user= dao.getByUsername(u.getUsername());
			dao.delete(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static User getUserTest() {
		User user = new User();
		Date data = new Date(System.currentTimeMillis());
		  user.setUsername("username");
		  user.setNome("nome");
		  user.setCognome("cognome");
		  user.setMail("mail");
		  user.setPassword("password");
		  user.setPaese("paese");			  
		  user.setCreazione(data);
		  return user;
	}
}
