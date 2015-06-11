package contactListPackage;

import java.io.*;
import java.util.ArrayList;

public class Contact implements Serializable {
	
	private String name;
	private String phoneNumber;
	private String notes;
	
	public static ArrayList<Contact> contacts = new ArrayList<Contact>();

	// Constructors---------------------------------------------------------------
	
	public Contact (String name, String phoneNumber, String notes) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
		contacts.add(this);
	}
	
	public Contact (String name, String notes) {
		this.name = name;
		this.notes = notes;
		contacts.add(this);
	}
	
	public Contact (String name) {
		this.name = name;
		contacts.add(this);
	}
	
	public Contact () {
		
	}
	
	// Methods--------------------------------------------------------------------
	
	public void setName (String n) {
		name = n;
	}
	
	public void setPhoneNumber (String p) {
		phoneNumber = p;
	}
	
	public void setNotes (String n) {
		notes = n;
	}
	
	public String getName () {
		return name;
	}
	
	public String getPhoneNumber () {
		return phoneNumber;
	}
	
	public String getNotes () {
		return notes;
	}
	
	
}
