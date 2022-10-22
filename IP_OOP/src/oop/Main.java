package oop;

import java.util.Scanner;

public class Main {
		
		public static void main(String[]args) {
			
//			Scanner sc = new Scanner(System.in);
			
			//classes and objects
			person p1 = new person ("Juan", "June 1 2021", 23, "Filipino", "Male");
			person p2 = new person ("Mandy" ,"Febuary 26 2003", 19, "American", "Female");
			
			System.out.println("First name: " + p1.fname);
			System.out.println("Birthday: " + p1.bDay);
			System.out.println("Age: " + p1.age);
			System.out.println("Nationality: " + p1.nationality);
			System.out.println("Gender: " + p1.gender);
		
			System.out.println("");
		
			System.out.println("First name: " + p2.fname);
			System.out.println("Birthday: " + p2.bDay);
			System.out.println("Age: " + p2.age);
			System.out.println("Nationality: " + p2.nationality);
			System.out.println("Gender: " + p2.gender);
		
			
			
			
	}
		
}

