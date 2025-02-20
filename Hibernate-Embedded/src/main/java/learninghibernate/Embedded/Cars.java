package learninghibernate.Embedded;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicles")
public class Cars {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carID;
	
	private String carName;
	
	@Embedded
	private CarOwner owner;
	
	private String email;
	
	private int yearOfManufacture;
	
	public Cars() {
		
	}

	public Cars(int carID, String carName, CarOwner owner, String email, int yearOfManufacture) {
		
		this.carID = carID;
		this.carName = carName;
		this.owner = owner;
		this.email = email;
		this.yearOfManufacture = yearOfManufacture;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public CarOwner getOwner() {
		return owner;
	}

	public void setOwner(CarOwner owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	
	
}
