package ClassCodingGroup;

public class Person {

	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private int EntryDate;
	

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getEntryDate() {
		return EntryDate;
	}

	public void setEntryDate(int entryDate) {
		EntryDate = entryDate;
	}
	
}
