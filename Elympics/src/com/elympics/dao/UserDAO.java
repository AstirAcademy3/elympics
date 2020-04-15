package com.elympics.dao;


import java.io.IOException;

import com.elympics.bean.User;

public interface UserDAO {
	/* Utente */
	public User login(String username, String password) throws Exception ;
	public void crea(User user) throws Exception ;
	public void delete(User user) throws Exception ;
	public User getByUsername(String username) throws Exception ;
	public void modifica(User user) throws Exception ;
	public User get(int utente);
}
