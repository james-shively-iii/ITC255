package ClassCodingGroup;

import java.util.Scanner;

public class Registration{
	
	public static void main(String[] args) {
		//initiate Scanner for user input
		Scanner con = new Scanner(System.in);
		//initiate Person class
		Person p1 = new Person();
		
		//user input and write into the p1 variable
		System.out.println("What is your first name?");
		p1.setFirstName(con.nextLine());
		System.out.println("What is your last name?");
		p1.setLastName(con.nextLine());
		System.out.println("What is your email?");
		p1.setEmail(con.nextLine());
		System.out.println("What is your desired password?");
		p1.setPassword(con.nextLine());
		System.out.println("What is today's date? (Please enter YYYYDDMM format)");
		p1.setEntryDate(con.nextInt());
		
		//Greet new entry
		System.out.println("Thank you " + p1.getFirstName() + " " + p1.getLastName() + 
						   " for registering. \nYour information has been recorded and"
						   + " you are ready to login.");
		
	}
}
