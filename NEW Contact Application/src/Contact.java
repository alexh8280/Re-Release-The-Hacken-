import java.time.LocalDateTime;

/*
 * Parent Class
 */
public class Contact {

	protected final int contactId;
	static int nextId = 1;
	private String name;
	private String number;
	private LocalDateTime createdAt;

	public static int getNextId() {
		return nextId;

	}

	public static void setNextId(int nextId) {
		Contact.nextId = nextId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public Contact(int contactId, String name, String number, LocalDateTime createdAt) {
		super();
		this.contactId = nextId++;
		this.name = name;
		this.number = number;
		this.createdAt = createdAt;
	}

	boolean VerifyNumber(String number) {
		if (number.length() == 12) {
			return true;

		}

		else {

			System.out.println("Not a Valid Number");
			return false;

		}
	}
}
