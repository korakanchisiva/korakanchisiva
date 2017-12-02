import com.sathya.hibernate.dao.PaymentDao;
import com.sathya.hibernate.dao.PaymentDaoFactory;
import com.sathya.hibernate.model.Card;
import com.sathya.hibernate.model.Cheque;

public class Main
	{
		public static void main(String[] args)
			{
			    System.out.println("arg0");
				PaymentDao dao = PaymentDaoFactory.getInstance();
				Card card = new Card("tx09123", 7000, new java.util.Date(), 500921, "VISA");
				dao.saveCard(card);;
				System.out.println("=============================================");
				Cheque cheque = new Cheque("tx06410", 9000, new java.util.Date(), 934521, "ORDER");
				dao.saveCheque(cheque);
				System.out.println("arg0");
				System.out.println("arg1");
			}

	}
