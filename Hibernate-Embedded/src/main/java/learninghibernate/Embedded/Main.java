package learninghibernate.Embedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
 
        // Start a transaction
        Transaction transaction = session.beginTransaction();
        
        Cars car = new Cars();
        
       car.setCarName("Lexus");
       car.setOwner(new CarOwner("Dorian","Kalisa", 772212065));
       car.setEmail("doriankalisa975@gmail.com");
       car.setYearOfManufacture(2016);
       
       session.save(car);
       
       transaction.commit();
       
       session.close();

	}

}
