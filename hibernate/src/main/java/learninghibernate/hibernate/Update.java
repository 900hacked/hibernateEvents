package learninghibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer entity = session.get(Customer.class, 30);
		if (entity != null) { // Update entity field
		entity.setProducts("JackFruit");
		session.update(entity);
		transaction.commit();

	}

}
	
}
