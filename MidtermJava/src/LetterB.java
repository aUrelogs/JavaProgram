import java.util.Scanner;

public class LetterB {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pin = 9576, enteredPin, balance = 1000;
		double fee = 10.00 ;

		System.out.println("Welcome to LandBank ATM");
		System.out.print("Please enter your pin: ");
		enteredPin = sc.nextInt();
		
		if (enteredPin == pin) { //if.1
			System.out.println("The pin is correct");
			System.out.print("How much money will you withdraw?: ");
	
			int withdraw = sc.nextInt();
			
				if (withdraw < balance) { //if.2
					
				int current = balance -  withdraw;
				current = (int) (current - fee);
				
					System.out.println("****************************");
					System.out.println("Your transaction: Withdrawal");
					System.out.println("Amount: " + +withdraw);
					System.out.println("Withdrawal Fee: P " + fee);
					System.out.println("New Balance: P " + current);
					System.out.println("****************************");
					System.out.println("Thank you for using our service!");
					
			} else { //else.2
				System.out.println("Insufficient amount");
			}
			
		} else { //else.1
			System.out.println("Incorrect pin");
		}
		
	}
}
