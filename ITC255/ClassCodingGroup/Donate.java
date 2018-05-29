package ClassCodingGroup;

import java.util.Scanner;

public class Donate {
	/*  
    public Donate(){
    	setDonationAttributes();
      	displayDonations();
    }
    
    private void setDonationAttributes(){
    	
    	
    	sc.close();
        
    }
	  private void displayDonations(){
    	System.out.println(d1.toString());
    }*/

	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int d1 = 0;
		  System.out.println("Enter donation amount");
		  d1 = sc.nextInt();
		  
		  if(d1 > 0) {
			  System.out.println("Thank you for your donation of $" + d1);
			  System.out.println("We appreciate your donation.");
		  } else {
			  System.out.println("Please enter a valid amount.");
			  d1 = sc.nextInt();
			  if(d1 > 0) {
				  System.out.println("Thank you for your donation of $" + d1);
				  System.out.println("We appreciate your donation.");
			  }
		  }
		  
		  sc.close();
	  }
}
