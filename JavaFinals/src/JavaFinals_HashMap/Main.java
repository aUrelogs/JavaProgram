package JavaFinals_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> fav = new HashMap<>();
		HashMap<Integer, String> fav2 = new HashMap<>();

		fav.put("kobe", 5);
		fav.put("lebron", 4);
		fav.put("stephen", 4);
		fav.put("michael", 6);
		fav.put("dwayne", 3);
		
		fav2.put(5, "Black Mamba");
		fav2.put(4, "The King");
		fav2.put(4, "Chef Curry");
		fav2.put(6, "Air Jordan");
		fav2.put(3, "D-Wade");

		System.out.println("Who is your favorite Basketball Player?");
		String player = sc.next().toLowerCase();
		
		System.out.println(fav2.get(fav.get(player)) + " has "+ fav.get(player) + " championships.");
	
		sc.close();	
	}

}
