package ClassCodingGroup;

import java.util.*;

public class Donations extends Registration{
	  private String donationKey;
	  private String donationDate;
	  private String donationAmount;
	  private ArrayList<Person> person;
	 
	  public Donations(){
		  person=new ArrayList<Person>();
	  }
	  
	public String getDonationKey() {
		return donationKey;
	}
	public void setDonationKey(String donationKey) {
		this.donationKey = donationKey;
	}

	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	 
	 public String getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(String donationAmount) {
		this.donationAmount = donationAmount;
	}

	public String toString(){
	   String donationInfo=getDonationKey() + "\n" + getDonationAmount() + "\n"
	+ getDonationDate() + "\n";
	   
	   for(Person a : person){
		   donationInfo += a.getFirstName() + "\n";
		   donationInfo += a.getLastName() + "\n";
	   }
	   return donationInfo;
	}
	public static void main(String[] args) {
		ArrayList<String> people = new ArrayList<String>();
	}
}