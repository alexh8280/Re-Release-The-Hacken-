import java.time.LocalDateTime;

public class OrganizationContacts extends Contact {

	
	//Attributes extending form Parent Class (name, number, createdAt)
	//Class own attribute Website
	
	private String website;

	public Contact(int contactId, int nextid, String name, String number, LocalDateTime createdAt, String website) {
		super();
		this.contactId = nextid++;
		this.name = name;
		this.number = number;
		this.createdAt = LocalDateTime.now();
		this.website = website;
	}
	
	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}
	
	public String generatecontactID() {
		
		return this.contactId + ":" + this.name + ":" + this.number + ":" + this.createdAt + ":" this.website;
	}

}