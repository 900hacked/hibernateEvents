package learninghibernate.Attribute_convertors;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Drug")
public class Convo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int drugID;
	
	private String drugName;
	
	@Convert(converter = PersonConvert.class)
	private Person person;
	
	public Convo() {
		
	}

	public Convo(int drugID, String drugName, Person person) {
		super();
		this.drugID = drugID;
		this.drugName = drugName;
		this.person = person;
	}

	public int getDrugID() {
		return drugID;
	}

	public void setDrugID(int drugID) {
		this.drugID = drugID;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
}
