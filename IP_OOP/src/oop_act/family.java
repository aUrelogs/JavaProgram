package oop_act;

import java.util.Scanner;

public class family {

	String family_name;
	int family_size;
	int elder;
	int child;
	int senior;
	boolean pwd;
	String prompt;
	
public static void famis(){
		
		Scanner sc = new Scanner(System.in);
		
		family fam = new family();
	
		System.out.print("Enter Family Name: ");
		fam.family_name = sc.nextLine();
		
		System.out.print("How many persons in the family: ");
		fam.family_size = sc.nextInt();
		
		System.out.print("How many adults in the family: ");
		fam.elder = sc.nextInt();
		
		System.out.print("How many children in the family: ");
		fam.child = sc.nextInt();
		
		System.out.print("Is there any senior in the family: ");
		char x = sc.next().charAt(0);
		
			if ((x == 'y') || (x == 'Y')){
				System.out.print("How many senior in the family: ");
				fam.senior = sc.nextInt();
			} else if ((x == 'n') || (x =='N')) {
				
			} else {
				System.out.println("Invalid Input, please repaeat the process or press F11");
			}
			
		System.out.print("Has anyone is a Person with Disabilty / PWD? [TRUE/FALSE]: ");
		fam.pwd = sc.nextBoolean();
		fam.prompt = "";
		
			if (fam.pwd = true) {
				fam.prompt = "There is a PWD in the family";
			} else {
				fam.prompt  = "None";
			}
			
			String familyname = fam.family_name;
			
			System.out.println("");
			System.out.println("Family name: " + familyname);
			System.out.println("Family size: " + fam.family_size);
			System.out.println("Adults Size: " + fam.elder);
			System.out.println("Children size: " + fam.child);
			System.out.println("Senior count: " + fam.senior);
			System.out.println("Person with disability: " + fam.prompt);
			
			sc.close();
	
	}

	
}
