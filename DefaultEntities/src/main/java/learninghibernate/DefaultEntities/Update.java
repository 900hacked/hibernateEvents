package learninghibernate.DefaultEntities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Office entity = session.get(Office.class, 58);
		if(entity != null) {
			entity.setResidence("Kyanja");
			session.update(entity);
			transaction.commit();
		}

	}

}
