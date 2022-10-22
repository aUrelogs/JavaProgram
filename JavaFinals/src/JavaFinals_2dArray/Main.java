package JavaFinals_2dArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String table[][] = {
				{"Full Name","Year","Car Brand","Model","Plate Number","Car Color"},
				{"Sierra Ortiz", "2021", "Toyota", "Hilux", "AGZ-3000", "Black"},
				{"Rhydian Talbot","2004","Mitsubishi","Evo","ABV-0408","Red"},
				{"Livia Cain","2021","Ford","Territory","FGZ-2202","Blue"},
				{"Keri Mclean","2005","Toyota","Tamarraw Fx","AMN-3403","Green"},
				{"Anais Chapman","2017","Honda","Civic","XFA-3504","Red"},
				{"Nafisa Conway","1998","Mazda","323","MAZ-9056","Silver"},
				{"Jaimee Seymour","2014","Ford","Mustang","FFB-3566","Yellow"},
				{"Jonah Mccartney","2006","Isuzu","Crosswind","JSO-6717","Pink"},
				{"Hayden Odling","1977","Layland","Mini","SLW 287R","Neon Green"}
		};
		
		for (int row = 0; row < table.length; row++) {
		
			
			for(int col = 0; col < table[row].length; col++) {
				
				System.out.print(table[row][col] + "\t");
				
			}
			System.out.println(" ");
		}
		
		
		
	}

}
