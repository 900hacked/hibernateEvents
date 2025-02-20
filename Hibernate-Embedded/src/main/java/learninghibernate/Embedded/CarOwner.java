package learninghibernate.Embedded;

import javax.persistence.Embeddable;

@Embeddable
public class CarOwner {

	private String firstName;
	
	private String lastName;
	
	private int phoneNumer;
	
	public CarOwner() {
		
	}

	public CarOwner(String firstName, String lastName, int phoneNumer) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumer = phoneNumer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(int phoneNumer) {
		this.phoneNumer = phoneNumer;
	}
	
	
}
