
public class Person extends Contact {
	
	protected String email;
	protected String dateOfBirth;
	
	public Person(String email, String dateOfBirth) {
		super();
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		
		//Tomas Test
	}
	
	
	

}
