package Gcashin;

import java.util.Scanner;

public class content {
	
	

	private String ser_name[] = {"G Cash", "Paypal", "PayMaya"};
	public String con_num;
	public double ammount;
	private double vat = 0.12;
	private double total;
	
	content(String[] ser_name, String con_num, double amount, double vat, double total){
		ser_name = this.ser_name;
		con_num = this.con_num;
		amount = this.ammount;
		vat = this.vat;
		total = this.total;
	}
	
	
	
	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Touch Pay Money Cash In System");
		System.out.println("Please select one option: [1] Gcash | [2] Paypal | [3] PayMaya");
		int a = sc.nextInt();
		
			switch(a) {
				case 1: content.Process();
			}
			
	}
	
	public static void Process() {
		System.out.println("Hello");
	}
	
	public static void Gcash() {
		
	}
	
	public static void Paypal() {
		
	}
	
	public static void PayMaya() {
		
	}
}
