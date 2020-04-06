package com.elympics.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.elympics.bean.User;


public class UserFileDAO implements UserDAO{
	//FUNZIONE RACCOLTA DATI
	private List<User> DataReciever() throws IOException{
		List<User> userList= new ArrayList<User>();
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Filippo\\Desktop\\progettoProva\\elympics\\Elympics\\FileTest\\user.txt"));
	    String line;
		while((line = in.readLine())!=null){
	          String[] pair = line.split(",");
	  		  User user = new User();
	          user.setUsername(pair[0]);
	          user.setPassword(pair[1]);
	          userList.add(user);
	      }
		return userList;
	}
	
	//FUNZIONE CONTROLLO LOGIN
	@Override

	public boolean CheckUser(User user) throws Exception {
		boolean check=false;
		List <User> userList = DataReciever();
	      for(int c=0;c<userList.size();c++) {
	    	  System.out.println(userList.get(c).getUsername());
	    	  if(userList.get(c).getUsername().equals(user.getUsername()) && userList.get(c).getPassword().equals(user.getPassword())) {
	    		  
	    		  check=true;
	    	  }
	      }
		return check;
	}
	//FUNZIONE REGISTRAZIONE UTENTE
	@Override
	public void AddUser(User user) throws Exception {
		Boolean check= CheckUser(user);
		if(check==false) {
			BufferedWriter outputWriter = null;
			  outputWriter = new BufferedWriter(new FileWriter("C:\\Users\\Filippo\\Desktop\\progettoProva\\elympics\\Elympics\\FileTest\\user.txt"));
			    outputWriter.write(user.getUsername()+","+user.getPassword());
			    outputWriter.newLine();
			  
			  outputWriter.flush();  
			  outputWriter.close();  
		}
		}

	@Override
	public void DeleteUser(User user) throws Exception {
		
		
	}

	@Override
	public User getByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}