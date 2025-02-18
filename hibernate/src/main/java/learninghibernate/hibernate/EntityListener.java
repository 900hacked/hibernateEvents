package learninghibernate.hibernate;

import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class EntityListener {

	@PrePersist
	 public void updateFirstNameBeforePersist(Customer customer) { 
		System.out.println("Before Persist: " + customer.getLastName()); 
		if (" ".equals(customer.getLastName())) { 
			// Use .equals() for string comparison
			customer.setLastName("Mubiru");  
			System.out.println("After Persist: " + customer.getLastName()); }
	}
	
	@PostPersist
	public void post(Customer customer) {
		System.out.println(customer);
	}

	@PreRemove
	public void remove(Customer customer) {
		System.out.println("This will display before deleting");
	}

	@PreUpdate
	public void update(Customer customer) {
		System.out.println("This will appear before updating");
	}
	

	@PostUpdate
	public void message(Customer customer) {
		System.out.println("This will appear after updating");	}
	
	@PostRemove
	public void delete(Customer customer) {
		System.out.println("This will appear after deleting");
	}
	

	
}
