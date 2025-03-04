package learninghibernate.Attribute_convertors;

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
		
		List<Convo> entities = session.createQuery("from Convo",Convo.class).list();
		 
		 for (Convo entity : entities) {
		 System.out.println(entity.getDrugName() + " " + entity.getPerson());
		 }

		 transaction.commit();
		 
		 session.close();

	}

}
