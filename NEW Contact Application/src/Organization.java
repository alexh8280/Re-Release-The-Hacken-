import java.time.LocalDateTime;

public class Organization extends Contact{

	//Attributes
	private String website;

	//Constructor
	public Organization(int contactId, String name, String number, LocalDateTime createdAt, String website) {
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
