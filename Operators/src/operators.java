import java.util.Scanner;

public class operators {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		/* System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Enter your grade");
		int grade = sc.nextInt();
		
		boolean boo = true;
		
		System.out.println(!(age >=18 || grade > 85));
		System.out.println("------------------------");
		System.out.println(!boo); */
		
		//String comparison
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println(name.equals("Hehe") || name.equals("hehe"));

	}
	
}
