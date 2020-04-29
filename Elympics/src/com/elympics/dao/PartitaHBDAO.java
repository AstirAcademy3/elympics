package com.elympics.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.elympics.bean.Gioco;
import com.elympics.bean.Partita;
import com.elympics.bean.RigaClassifica;
import com.elympics.bean.User;
import com.elympics.util.HibernateUtil;

public class PartitaHBDAO extends HBDAO implements PartitaDAO  {
	@Override
	public List <Partita> getAll() throws Exception {
		List <Partita> result=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query<Partita> q = session.createQuery("from Partita",Partita.class);
			result=q.list();
			tx.commit();
		}
		catch (HibernateException he) {
			if (tx!=null) 
				tx.rollback();
			throw he;
		}
		finally {
			session.close();
		}
		return result;
	}
	
	public void crea(Partita partita) throws Exception {
		super.crea(partita);
	}
	
	public void delete(Partita partita) throws Exception {
		super.delete(partita);
    }
	
	final List <RigaClassifica> result=new ArrayList<RigaClassifica>();;

	public List <RigaClassifica> getClassifica(Gioco gioco) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			
			String sql = "select utente_id, max(punteggio), gioco_id from partita where gioco_id = " + gioco.getId() + " group by utente_id";	


			Query q = session.createSQLQuery(sql);
			//q.setParameter(":gioco", gioco.getId());
			result.clear();
			List<Object[]> dati = q.list();
			
			if(dati != null && dati.size()>0) {
				dati.stream().forEach(

					 

					    (x) -> {
					            Integer utente = (Integer) x[0];
					            Integer punteggio = (Integer) x[1];
					            Integer gioco_id = (Integer) x[2];
					            if(utente!= null && punteggio != null && gioco_id != null)
					            	result.add(new RigaClassifica(utente, gioco_id, punteggio));
					    }
					);
			}
			tx.commit();
		}
		catch (HibernateException he) {
			if (tx!=null) 
				tx.rollback();
			throw he;
		}
		finally {
			session.close();
		}
		return result;
	}
	public List <RigaClassifica> getClassificaPerPaese(User user, Gioco gioco) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			
			String sql = "select utente_id, max(punteggio), gioco_id" 
					   + " from partita join utente on (utente.id = partita.utente_id)"
					   + " where gioco_id = " + gioco.getId()  
					   + " and paese='" + user.getPaese() +"'" 
					   + " group by utente_id ";	


			Query q = session.createSQLQuery(sql);
			//q.setParameter(":gioco", gioco.getId());
			//q.setParameter(":paese", user.getPaese());
			result.clear();
			List<Object[]> dati = q.list();
			
			if(dati != null && dati.size()>0) {
				dati.stream().forEach(

					 

					    (x) -> {
					            Integer utente = (Integer) x[0];
					            Integer punteggio = (Integer) x[1];
					            Integer gioco_id = (Integer) x[2];
					            if(utente!= null && punteggio != null && gioco_id != null)
					            	result.add(new RigaClassifica(utente, gioco_id, punteggio));
					    }
					);
			}
			tx.commit();
		}
		catch (HibernateException he) {
			if (tx!=null) 
				tx.rollback();
			throw he;
		}
		finally {
			session.close();
		}
		return result;
	}

	@Override
	public List<RigaClassifica> getGiochiPartitaPerPaese(User u) {
		// TODO Auto-generated method stub
		return null;
	}
}
