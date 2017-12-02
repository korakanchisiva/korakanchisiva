package com.sathya.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Card;
import com.sathya.hibernate.model.Cheque;
import com.sathya.hibernate.util.HibernateUtil;

public class PaymentDaoImpl implements PaymentDao
	{
		private SessionFactory factory;
		public PaymentDaoImpl()
			{ 
				factory = HibernateUtil.getSessionFactory();
			}
		
		@Override
		public void saveCard(Card card)
			{
				Session session = factory.openSession();
				Transaction tx = session.beginTransaction();
				session.save(card);
				tx.commit();
				session.close();
			}

		@Override
		public void saveCheque(Cheque cheque)
			{
				Session session = factory.openSession();
				Transaction tx = session.beginTransaction();
				session.save(cheque);
				tx.commit();
				session.close();
			}

	}
