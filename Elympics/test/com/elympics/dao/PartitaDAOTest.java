package com.elympics.dao;

import java.util.Date;
import java.util.List;

import com.elympics.bean.Gioco;
import com.elympics.bean.Partita;
import com.elympics.bean.RigaClassifica;
import com.elympics.bean.User;

public class PartitaDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitaDAO dao= new PartitaHBDAO();
		//Partita u= getPartitaTest();
		try {
			//dao.AddPartita(u);
			List<Partita> partita= dao.getAll();
			Gioco gioco = new Gioco();
			
			gioco.setId(1);
			List<RigaClassifica> classifica= dao.getClassifica(gioco);
			System.out.println( (classifica.size()>0) ? classifica.get(0) : "non ce ne sono!" );
			
			gioco.setId(2);
			List<RigaClassifica> classifica1= dao.getClassifica(gioco);
			System.out.println( (classifica1.size()>0) ? classifica1.get(0) : "non ce ne sono!" );
			
			gioco.setId(3);
			List<RigaClassifica> classifica2= dao.getClassifica(gioco);
			System.out.println( (classifica2.size()>0) ? classifica2.get(0) : "non ce ne sono!" );

			gioco.setId(4);
			List<RigaClassifica> classifica3= dao.getClassifica(gioco);
			System.out.println( (classifica3.size()>0) ? classifica3.get(0) : "non ce ne sono!" );		
			
			gioco.setId(5);
			List<RigaClassifica> classifica4= dao.getClassifica(gioco);
			System.out.println( (classifica4.size()>0) ? classifica4.get(0) : "non ce ne sono!" );

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


