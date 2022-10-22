package DSA_Week1;
import java.util.Scanner;

public class HelloWorld 
{

	public static void main(String[]args) 
	{
		sum();
		
		
	}
	
	static void sum() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Input two numbers: ");
		
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println(sum);
		
		//overall its all about methods
	}
}
