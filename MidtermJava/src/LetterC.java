import java.util.Scanner;

public class LetterC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your last number of your plate number: ");
		int pNum = sc.nextInt();
		
		if ((pNum >= 0) && (pNum <= 9)){
			
			if (pNum == 1 || pNum == 2) {
				System.out.println("Your car is not allowed on Monday");
			} else if (pNum == 3 || pNum == 4) {
				System.out.println("Your car is not allowed on Tuesday");
			} else if (pNum == 5 || pNum == 6) {
				System.out.println("Your car is not allowed on Wednesday");
			} else if (pNum == 7 || pNum == 8) {
				System.out.println("Your car is not allowed on Thursday");
			} else {
				System.out.println("Your car is not allowed on Friday");
			}
		} else {
			System.out.println("Invalid input, 0-9 only");
		}
			

	}

}
