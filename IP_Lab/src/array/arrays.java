package array;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
	
//			int num[] = {21,54,87,54};
//			
//				for (int i = 0; i < num.length; i++) {
//					System.out.println(num[i]);
//					
//				}

		
//		int ages[] = new int[100]; //Declares 100 indexes -> (0-99)
//		System.out.println(ages[88]);

		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
			int q = b / a;
			int r = a % b;
			
			System.out.println(q);
			System.out.println(r);
		
		
	}

}
