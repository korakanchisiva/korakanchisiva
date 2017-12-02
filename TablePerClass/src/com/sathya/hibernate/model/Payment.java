package com.sathya.hibernate.model;

import java.util.Date;

public class Payment
	{
		private String txId;
		private double amount;
		private Date txDate;
		public Payment()
		{	}
		public Payment(String txId, double amount, Date txDate)
		{
			this.txId = txId;
			this.amount = amount;
			this.txDate = txDate;
		}
		public String getTxId()
			{
				return txId;
			}
		public void setTxId(String txId)
			{
				this.txId = txId;
			}
		public double getAmount()
			{
				return amount;
			}
		public void setAmount(double amount)
			{
				this.amount = amount;
			}
		public Date getTxDate()
			{
				return txDate;
			}
		public void setTxDate(Date txDate)
			{
				this.txDate = txDate;
			}
	}
