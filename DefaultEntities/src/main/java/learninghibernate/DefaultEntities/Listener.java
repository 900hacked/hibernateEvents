package learninghibernate.DefaultEntities;

import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;



public class Listener {
	
	@PrePersist
	public void updateNationality(Office office) {
		System.out.println("Before Persist: " + office.getNationality());
		if(" ".equals(office.getNationality())) {
			office.setNationality("Uganadan");
			System.out.println("After Persist: " + office.getNationality());
		}
	}
	
	@PostPersist
	public void saving(Office office) {
		System.out.println("You will see this after saving");
	}
	
	@PreRemove
	public void remove(Office office) {
		System.out.println("This will display before deleting");
	}

	@PreUpdate
	public void update(Office office) {
		System.out.println("This will appear before updating");
	}
	

	@PostUpdate
	public void message(Office office) {
		System.out.println("This will appear after updating");	}
	
	@PostRemove
	public void delete(Office office) {
		System.out.println("This will appear after deleting");
	}

}
