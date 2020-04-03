package com.elympics.dao;


import java.io.IOException;

import com.elympics.bean.User;

public interface UserDAO {
	/* Utente */
	public boolean CheckUser(User user) throws Exception ;
	public void AddUser(User user) throws Exception ;
	public void DeleteUser(User user) throws Exception ;
	public User getByUsername(String username) throws Exception ;
}
