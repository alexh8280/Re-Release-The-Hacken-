import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.time.*;

public class Main {
	
	static ArrayList<Contact> contacts = new ArrayList<Contact>();

	public static void main(String[] args) {
		
		String name;
		String email;
		String phone;
		String website;
		String dob;
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Contact List Application");

		// menu in forever loop

		while (true) {
			System.out.println("\n[1] Add");
			System.out.println("[2] List");
			System.out.println("[3] Count");
			System.out.println("[4] Info");
			System.out.println("[5] Delete");
			System.out.println("[6] Search");
			System.out.println("[7] Exit");
			System.out.println("Choose a number from the menu");
			int choice = scan.nextInt();

			// add option

			if (choice == 1) {
				System.out.println("Enter the type (person or organization)");
				String type = scan.next();

				// person

				if (type.equals("person")) {


					// LocalDateTime dob;

					// DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
					// df.getCalendar().setLenient(false);

					scan.nextLine();
					System.out.print("Name: ");
					name = scan.nextLine();
					System.out.print("Email address: ");
					email = scan.nextLine();
					System.out.print("Date of birth (MM/DD/YYYY): ");
					dob = scan.next();
					System.out.print("Phone number: ");
					phone = scan.nextLine(); // .verifyNumber()

					// LocalDateTime createdAt = LocalDateTime.now();
					// Calendar dob = df.getCalendar();

					contacts.add(new Person(name, email, dob, phone));

				}

				// organization

				else if (type.equals("organization")) {


					scan.nextLine();
					System.out.print("Name: ");
					name = scan.nextLine();
					scan.nextLine();
					System.out.print("Website: ");
					website = scan.nextLine();
					System.out.print("Phone number: ");
					phone = scan.nextLine(); // .verifyNumber()

					contacts.add(new Organization(name, website, phone));
				}

				// list option:

				if (choice == 2) {
					for (Contact contact : contacts) {
						System.out.println(contact.getContactId() + ": " + contact.getName());
					}
				}

				// count option:
				if (choice == 3) {
					System.out.println("The contact list has " + contacts.size() + " records");
				}

				// info option:
				if (choice == 4) {
					for (Contact contact : contacts) {
						System.out.println(contact.getContactId() + ": " + contact.getName());
					}
					System.out.println("Enter user ID for more information");
					int input = scan.nextInt();
					// System.out.println(contact[input].toString);
				}
			}
			// delete option:

			for (Contact contact : contacts) {
				System.out.println(contact.getContactId() + ": " + contact.getName());
			}
			System.out.println("Enter user ID to delete");
			int input = scan.nextInt();
			contacts.remove(input);
			scan.close();
			// exit option:
			break;
			
			
		}
	}
}