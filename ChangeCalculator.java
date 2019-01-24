import java.util.Scanner;
public class ChangeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//The application displays the minimum number of quarters, dimes, nickels, and pennies that represent the coins that make up the specified number of cents.
		//The application prompts the user to continue.
		//Specifications
		//⦁	Assume that the user will enter a valid integer value for the number of cents.
		//⦁	The application should continue only if the user enters “y” or “Y” to continue
		
		
		Scanner scanner = new Scanner(System.in);
	    
	    String choice = "y";
	    while(choice.equalsIgnoreCase("y")) {
	    	
	    	//Prompt the user to enter a number of cents from 0 to 99.
	    	System.out.println("Enter the number of cents from 0 to 99:  ");
		    
	    	//set input to amount
	    	int amount = Integer.parseInt(scanner.nextLine());
	    	
	    	//find the amount of quarters
	    	int quarters = amount/25;
	        
	    	//displays the number of quarters
	    	System.out.println ("quarters: " + quarters);
	        
	    	//find the remainder
	    	amount = amount % 25;
	        
	    	//find the amount of dimes
	    	int dimes = amount/10;
	        
	    	//displays the number of dimes
	    	System.out.println ("dimes: " + dimes );
	        
	    	//find the remainder
	    	amount = amount % 10;
	        
	    	//find the amount of nickels
	    	int nickels = amount/5;
	        
	    	//displays the number of nickels
	    	System.out.println ("nickels: " + nickels);
	        
	    	//find the remainder
	    	amount = amount % 5;
	        
	    	//find the amount of pennies
	    	int pennies = amount/1;
	        
	    	//displays the number of pennies
	    	System.out.println ("pennies: " + pennies);
	        
	    	//reset amount
	    	amount = amount % 1; 
	    		
	    	//ask if user wants to continue
			System.out.println("Continue type y:");
			choice = scanner.nextLine();
			System.out.println("End");
	    }
	    scanner.close();

	}

}
