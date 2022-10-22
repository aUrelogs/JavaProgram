package elskl;
import java.util.*;

public class elseif {

	public static void main(String[]agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
			if (age >= 18 || age <=65) {
				
				System.out.println("Welcome to our System hehe.");
				System.out.println("Please enter name: ");
				String name = sc.nextLine();		
					if (name.equals("Paul")) {
						System.out.println("Hello Paul!");
						
						System.out.println("What is the passcode?"); 
						int pass = sc.nextInt();
						
						if (pass == 0000) {
							System.out.println("Welcome to Vip Room");
						} else {
							System.out.println("you are not allowed here");
						}
						
					} else {
						System.out.println("wrong name");
					}
			} else {
				System.out.println("Out of bounds age");
			}
		

	}
}
