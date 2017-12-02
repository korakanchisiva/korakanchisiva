package com.sathya.hibernate.model;

import java.util.Date;

public class Cheque extends Payment
	{
		private int chequeNo;
		private String chequeType;
		public Cheque()
		{	}
		public Cheque(String txId, double amount, Date txDate, int chequeNo, String chequeType)
		{
			super(txId, amount, txDate);
			this.chequeNo = chequeNo;
			this.chequeType = chequeType;
		}
		public int getChequeNo()
			{
				return chequeNo;
			}
		public void setChequeNo(int chequeNo)
			{
				this.chequeNo = chequeNo;
			}
		public String getChequeType()
			{
				return chequeType;
			}
		public void setChequeType(String chequeType)
			{
				this.chequeType = chequeType;
			}
	}
