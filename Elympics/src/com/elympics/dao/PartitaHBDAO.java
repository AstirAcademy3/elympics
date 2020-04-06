package com.elympics.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.elympics.bean.Partita;
import com.elympics.bean.User;
import com.elympics.util.HibernateUtil;

public class PartitaHBDAO implements PartitaDAO  {
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
	public void AddPartita(Partita id) throws Exception {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.persist(id);
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
}
}
