package learninghibernate.DefaultEntities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Office office = new Office();
		office.setEmployeeName("tasneem");
		office.setAge(29);
		office.setNationality("Congo");
		
		// Save the student object
        session.save(office); //now customer is persistent
 
        // Commit transaction
        transaction.commit();
 
        // Close the session
        session.close();
		

	}

}
