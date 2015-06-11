package contactListPackage;
import java.util.Scanner;

public class Input {
	
	Scanner scanner = new Scanner(System.in);
	
	public void newEntry () {
		Contact contact = new Contact();
		System.out.println("Please enter the name");
		contact.setName(read());
		
		System.out.println("Please enter the Number. Leave blank if no number.");
		String number = read();
		if (number != null) {
			contact.setPhoneNumber(number);
		}
		
		System.out.println("Please enter notes. Leave blank if no notes.");
		String notes = read();
		if (notes != null) {
			contact.setNotes(notes);
		}
	}
	
	private String read() {
		return scanner.nextLine();

	}
	
}
