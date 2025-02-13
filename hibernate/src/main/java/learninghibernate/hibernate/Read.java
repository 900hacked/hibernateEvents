package learninghibernate.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Read {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		List<Customer> entities = session.createQuery("from Customer",Customer.class).list();
		 // Iterate and print the fetched records
		 for (Customer entity : entities) {
		 System.out.println(entity.getFullName() + " " + entity.getProducts() + " " + entity.getTotalPrice() + " " + entity.getCurrentDate());
		 }

		 transaction.commit();
		 
		 session.close();
	}

}
