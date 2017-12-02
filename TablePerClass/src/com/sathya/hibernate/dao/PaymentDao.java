package com.sathya.hibernate.dao;

import com.sathya.hibernate.model.Card;
import com.sathya.hibernate.model.Cheque;

public interface PaymentDao
	{
		void saveCard(Card card);
		void saveCheque(Cheque cheque);
	}