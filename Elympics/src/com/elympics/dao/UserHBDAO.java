package com.elympics.dao;

import java.io.IOException;
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
	public boolean CheckUser(User user) throws Exception {
		
		return false;
	}

	@Override
	public void AddUser(User user) throws Exception {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
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
	public void DeleteUser(User user) throws Exception {
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

}
