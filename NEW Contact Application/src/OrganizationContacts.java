import java.time.LocalDateTime;

public class OrganizationContacts extends Contact {

	
	//Attributes extending form Parent Class (name, number, createdAt)
	//Class own attribute Website
	
	private String website;

	public OrganizationContacts(int contactId, String name, String number, LocalDateTime createdAt, String website) {
		super(contactId, name, number, createdAt);
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	
	}

