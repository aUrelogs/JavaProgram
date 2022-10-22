import java.util.Scanner;

public class LetterA {

	public static void main(String [] args) {
		
		/* Create an application that will ask the 
		user's current time. It will print “Good Morning” when the user enters “5”.
		Do not use the time and date function in Java; 
		the data type should be integer. Use the table as your guide 
		
		12mn-11am = Good morning
		12nn-5pm = Good afternoon 
		6pm-9pm = Good evening
		10pm-11pm = Sleeping Time

		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("24 hrs time format (00:00 - 23:59)");
		System.out.print("Enter the current time: " );
		int time = sc.nextInt();
		
		if ((time >= 0) && (time <= 11) || (time == 24)) {
			System.out.println("Good Morning");
			System.out.println("Ranging time: 12mn - 11am");
		} else if ((time >= 12) && (time <= 17)){
			System.out.println("Good Afternoon");
			System.out.println("Ranging time: 12nn - 5pm");
		} else if ((time >= 18) && (time <= 21)) {
			System.out.println("Good Evening");
			System.out.println("Ranging time: 6pm - 9pm");
		} else if ((time >= 22) && (time <= 23)) {
			System.out.println("Sleeping time");
			System.out.println("Ranging time: 10pm - 11pm");
		} else {
			System.out.println("Invalid input of time, 0 - 24 only");
		}
	
	}
}
