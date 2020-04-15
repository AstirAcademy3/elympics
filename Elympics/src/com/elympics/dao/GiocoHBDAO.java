package com.elympics.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.elympics.bean.Gioco;
import com.elympics.bean.Partita;
import com.elympics.bean.User;
import com.elympics.util.HibernateUtil;

public class GiocoHBDAO extends HBDAO implements GiocoDAO {

	@Override
	public List<Gioco> getAll() {
		List <Gioco> result=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query<Gioco> q = session.createQuery("from Gioco",Gioco.class);
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
		return result;	}

	@Override
	public Gioco get(int id) {
		
			return (Gioco) super.get(Gioco.class, id);
	}

}
