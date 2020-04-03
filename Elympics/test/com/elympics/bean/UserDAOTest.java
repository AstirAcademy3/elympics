package com.elympics.bean;

import java.util.Date;

import com.elympics.dao.UserDAO;
import com.elympics.dao.UserHBDAO;



public class UserDAOTest {
	public static void main(String[] args) {
		UserDAO dao= new UserHBDAO();
		User u= getUserTest();
		try {
			dao.AddUser(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static User getUserTest() {
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
}
