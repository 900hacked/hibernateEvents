package learninghibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SingleRead {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer entity = session.get(Customer.class, 28); // 1 is the primary key (id)
		if (entity != null) {
		 System.out.println(entity.getFullName());
		}
		transaction.commit();
		
		session.close();

	}

}
