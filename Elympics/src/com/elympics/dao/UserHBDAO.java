package com.elympics.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.elympics.bean.User;
import com.elympics.util.HibernateUtil;
//implementa hibernate
public class UserHBDAO implements UserDAO{

	@Override
	public User login(String username, String password) throws Exception {
    	User result=null;
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query<User> q = session.createQuery("from User where username=:utente and password=:password",User.class);
			q.setParameter("utente", username);
			q.setParameter("password", password);
			List<User>l = q.list();
			if(l.size()>0) {
				result=l.get(0);
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
	public void crea(User user) throws Exception {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				user.setCreazione(new Date());
				session.persist(user);
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

	@Override
	public void delete(User user) throws Exception {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.delete(user);
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

	@Override
	public User getByUsername(String username) throws Exception {
		User result=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query<User> q = session.createQuery("from User where username=:username",User.class);
			q.setParameter("username", username);
			result=q.list().get(0);
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
	public void modifica(User user) throws Exception {
		
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(user);
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
