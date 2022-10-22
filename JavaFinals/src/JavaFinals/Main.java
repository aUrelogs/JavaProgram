package JavaFinals;


public class Main {

	public static void main(String[]args) {
		
//		size; color; touchscreen; camera; storage;
		
		Class_C1 cellphone = new Class_C1("SamSang","1920 x 1490", "Blue", "Yes", "12MP", "32GB-RAM", "Type C");
		Class_C2 laptop = new Class_C2("Lenavies", "No definite size", "Black", "No", "6MP", "6GB-RAM 500GB-SSD", "i5");
		Class_C3 tablet = new Class_C3("Mango Pod","6 inches x 9 inches", "Gold", "Yes", "4MP", "64GB-ROM 4GB-RAM");
		
		//cellphone:
		System.out.println("");
		cellphone.OpeningMessage();
		System.out.println("");
		
		String c_chargerType = cellphone.chargerType;
		String c_size = cellphone.getSize();
		String c_camera = cellphone.getCamera();
		String c_storage = cellphone.getStorage();
		
		System.out.print("Device Type: ");
		cellphone.GadgetType();
		
		System.out.print("Operating System: ");
		cellphone.OS();
		
		System.out.print("Manufacturer: ");
		cellphone.Manufacturer();
		System.out.println("");
		
		System.out.println("Charger Type: " + c_chargerType);
		System.out.println("Size: " + c_size);
		System.out.println("Camera: " + c_camera);
		System.out.println("Storage: " + c_storage);
		
		System.out.print("\n");
		cellphone.ClosingMessage();
		System.out.println("");
		System.out.println("-------------------------------");
		
		//laptop:
		System.out.println("");
		laptop.OpeningMessage();
		System.out.println("");
			
		String l_gen = laptop.gen;
		String l_size= laptop.getSize();
		String l_camera = laptop.getCamera();
		String l_storage = laptop.getStorage();
		
		System.out.print("Device Type: ");
		laptop.GadgetType();
		
		System.out.print("Operating System: ");
		laptop.OS();
		
		System.out.print("Manufacturer: ");
		laptop.Manufacturer();
		System.out.println("");
		
		System.out.println("Generation: " + l_gen );
		System.out.println("Size: " + l_size);
		System.out.println("Camera: " + l_camera);
		System.out.println("Storage: " + l_storage);
				
		System.out.print("\n");
		laptop.ClosingMessage();
		System.out.println("");
		System.out.println("-------------------------------");
		
		//tablet:
		System.out.println("");
		tablet.OpeningMessage();
		System.out.println("");
					
		String t_size= tablet.getSize();
		String t_camera = tablet.getCamera();
		String t_storage = tablet.getStorage();
				
		System.out.print("Device Type: ");
		tablet.GadgetType();
		
		System.out.print("Operating System: ");
		tablet.OS();
		
		System.out.print("Manufacturer: ");
		tablet.Manufacturer();
		System.out.println("");
		
		System.out.println("Size: " + t_size);
		System.out.println("Camera: " + t_camera);
		System.out.println("Storage: " + t_storage);
						
		System.out.print("\n");
		tablet.ClosingMessage();
		System.out.println("");
		System.out.println("-------------------------------");
				
	}

	
	
}
