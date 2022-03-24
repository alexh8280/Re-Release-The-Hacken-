import java.time.LocalDateTime;

public class Contact {

	
	//Attributes
	protected final int contactId;
	static int nextId = 1;
	private String Name;
	private String Number;
	private LocalDateTime createdAt; //LocalDateTime.now();
	public static int getNextId() {
		return nextId;
	}
	
	
	//Constructors using attributes
	public Contact(int contactId, String name, String number, LocalDateTime createdAt) {
		super();
		this.contactId = contactId;
		Name = name;
		Number = number;
		this.createdAt = createdAt;
	}

	//Getters and Setters for attributes
	public static void setNextId(int nextId) {
		Contact.nextId = nextId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public int getContactId() {
		return contactId;
	}
	
	//Method: Checks if phone number has 12 characters 000-000-0000
	
	public static boolean verifyNumber(String phoneNumber) {
		
		if(phoneNumber.matches("\\d{3}\\-\\d{3}-\\d{4}")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
}
