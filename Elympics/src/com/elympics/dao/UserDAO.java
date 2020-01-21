package com.elympics.dao;

import java.util.Date;
import com.elympics.bean.User;
import com.elympics.bean.UserTest;;




public class UserDAO{
	
	public User getUser (String username, String password){
	
		if(username != null && password != null && username.equals("admin") && password.equals("admin")){
			return new UserTest();	
		}
		else {
			return null;
		}
	
	}
	
	public User getUser (String username){
		
		if(username != null && username.equals("admin") ){
			return new UserTest();	
		}
		else {
			return null;
		}
	
	}
	public void creaUser (User user){
		//TODO qui inserire la logica di creazione dell'oggetto
	}
	
	public void modificaUser (User user){
		//TODO qui inserire la logica di modifica dell'oggetto
	}
	
	public void eliminateUser (User user){
		user.setEliminazione(new Date());
		modificaUser(user);
	}
	
	public void bloccaUser (String user){
		User u = new User();
		u.setUsername(user);
		u.setEliminazione(new Date());
		modificaUser(u);
		
	}
	
	
	
	
	
	
}