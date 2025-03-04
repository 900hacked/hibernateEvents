package learninghibernate.Attribute_convertors;

public class Person {

	
	
	private String name;
	
	private String residence;
	
	private Integer age;
	
	public Person() {
		
	}

	public Person( String name, String residence, Integer age) {
		
		this.name = name;
		this.residence = residence;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
