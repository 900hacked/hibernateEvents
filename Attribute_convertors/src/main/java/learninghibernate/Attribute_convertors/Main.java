package learninghibernate.Attribute_convertors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Convo convo = new Convo();
		
		convo.setDrugName("Panadol");
		convo.setPerson(new Person("Dorian","Muyenga", 20));
		
		session.save(convo);
		 
        // Commit transaction
        transaction.commit();
 
        // Close the session
        session.close();

	}

}
