package learninghibernate.Attribute_convertors;

import javax.persistence.AttributeConverter;

public class PersonConvert implements  AttributeConverter<Person, String> {
	
	private static final String SEPARATOR = ", ";

	@Override
	public String convertToDatabaseColumn(Person person) {
		if(person == null) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		
		if(person.getName() != null && !person.getName().isEmpty()) {
			sb.append(person.getName());
			sb.append(SEPARATOR);
		}
		
		if(person.getResidence() != null && !person.getResidence().isEmpty()) {
			sb.append(person.getResidence());
			sb.append(SEPARATOR);
		}
		
		if(person.getAge() != null) {
			sb.append(person.getAge());
		}
		
	
		return sb.toString();
	}

	@Override
	public Person convertToEntityAttribute(String dbPerson) {
		if (dbPerson == null || dbPerson.isEmpty()) {
		return null;
	}
		String[] pieces = dbPerson.split(SEPARATOR);
		
		if (pieces == null || pieces.length == 0) {
            return null;
        }
		
		 Person personName = new Person();        
	        String firstPiece = !pieces[0].isEmpty() ? pieces[0] : null;
	        String secondPiece = !pieces[1].isEmpty() ? pieces[1] : null;
	        String thirdPiece = !pieces[2].isEmpty() ? pieces[2] : null;
	        
	        if (dbPerson.contains(SEPARATOR)) {
	            personName.setName(firstPiece);

	          personName.setResidence(secondPiece); 
	          personName.setAge(Integer.valueOf(thirdPiece));
	            
	        }
	        

	        return personName;


}
}
