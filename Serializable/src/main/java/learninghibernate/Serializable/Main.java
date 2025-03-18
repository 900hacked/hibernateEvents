package learninghibernate.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		OrderDetails order = new OrderDetails();
		
		order.setOrderDetailsId(new OrderDetailsId(1,2));
		order.setProductName("Torches");
		order.setNameOfPerson("Megan");
		
		session.save(order);
		 
        // Commit transaction
        transaction.commit();
 
        // Close the session
        session.close();

	}

}
