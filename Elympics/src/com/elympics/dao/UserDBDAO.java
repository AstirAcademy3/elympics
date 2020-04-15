package com.elympics.dao;


import com.elympics.bean.User;


public class UserDBDAO implements UserDAO{

/*	@Override
	public boolean CheckUser(User user) throws Exception {
		String sql=" select username, '1' as esito"
				  +" from utente"
				  +" where username='"+user.getUsername()+"' and pass='"+user.getPassword()+"'";
		return false;
	}*/

	@Override
	public void crea(User user) throws Exception {
		String sql="INSERT INTO utente(username, nome, cognome, email, pass, paese, data_inserimento, data_eliminazione)" + 
					" values ('"
					+user.getUsername()+"',"
					+" 'Davide','Gentile','davigenti@hotmail.it','1234','Italia','2020-02-07',null);";
		
	}

	@Override
	public void delete(User user) throws Exception {
		String sql="UPDATE data_eliminazione=NOW() on utente where username='"+user.getUsername()+"';";
	}

	@Override
	public User getByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifica(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int utente) {
		// TODO Auto-generated method stub
		return null;
	}

}
