package learninghibernate.DefaultEntities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@EntityListeners(Listener.class)
@Entity
@Table(name= "Work")
public class Office {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		int workID;

	private String EmployeeName;
	private int Age;

	private String residence = "Kampala";
	
	@Column(length = 5)
	private String nationality;

	public Office() {
		
	}

	public Office( String employeeName, int age, String residence, String nationality) {
		
		
		EmployeeName = employeeName;
		Age = age;
		this.residence = residence;
		this.nationality = nationality;
	}

	public int getWorkID() {
		return workID;
	}

	public void setWorkID(int workID) {
		this.workID = workID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	}


