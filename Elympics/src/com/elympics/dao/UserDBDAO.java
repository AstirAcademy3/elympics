package com.elympics.dao;


import com.elympics.bean.User;


public class UserDBDAO implements UserDAO{

	@Override
	public boolean CheckUser(User user) throws Exception {
		String sql=" select username, '1' as esito"
				  +" from utente"
				  +" where username='"+user.getUsername()+"' and pass='"+user.getPassword()+"'";
		return false;
	}

	@Override
	public void AddUser(User user) throws Exception {
		String sql="INSERT INTO utente(username, nome, cognome, email, pass, paese, data_inserimento, data_eliminazione)" + 
					" values ('"
					+user.getUsername()+"',"
					+" 'Davide','Gentile','davigenti@hotmail.it','1234','Italia','2020-02-07',null);";
		
	}

	@Override
	public void DeleteUser(User user) throws Exception {
		String sql="UPDATE data_eliminazione=NOW() on utente where username='"+user.getUsername()+"';";
	}

}
