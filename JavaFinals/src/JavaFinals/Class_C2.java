package JavaFinals;

public class Class_C2 extends Class_P{

	//Laptop
	
	String gen;
	
	Class_C2(String unit, String size, String color, String touchscreen, String camera, String storage, String gen) {
		super(unit, size, color, touchscreen, camera, storage);
		this.gen = gen;
		// TODO Auto-generated constructor stub
	}

	
	//methods
			public void OpeningMessage() {
				System.out.println("Hey!");
			}
			
			public void ClosingMessage() {
				System.out.println("Thank you for using Laptop!");
			}


	@Override
	void OS() {
	// TODO Auto-generated method stub
				System.out.println("Microsoft Windows");
	}


	@Override
	void Manufacturer() {
		// TODO Auto-generated method stub
		System.out.println("Microsoft");
	}


	@Override
	void GadgetType() {
		// TODO Auto-generated method stub
		System.out.println("Laptop");	
	}


			

}