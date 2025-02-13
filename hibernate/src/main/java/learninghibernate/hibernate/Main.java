package learninghibernate.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		   // Open a session
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
 
        // Start a transaction
        Transaction transaction = session.beginTransaction();
 
        // Create a new Student object
        Customer customer = new Customer();
        customer.setCustomerName("brad");
        customer.setFirstName("Brandy");
        customer.setLastName("Kato"); //change is tracked
        customer.setFullName();
        customer.setProducts("Pears");
        customer.setQuantity(2);
        customer.setCostPerItem(600);
        customer.setTotalPrice();
        customer.setCurrentDate(new Date());
        customer.setGender(Gender.MALE);
        
        System.out.println(customer.getFullName());
        
 
        // Save the student object
        session.save(customer); //now customer is persistent
 
        // Commit transaction
        transaction.commit();
 
        // Close the session
        session.close();
        

	}

}
