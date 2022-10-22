package JavaFinals;

public class Class_C3 extends Class_P{

	//Tablet
	
	Class_C3(String unit, String size, String color, String touchscreen, String camera, String storage) {
		super(unit, size, color, touchscreen, camera, storage);
		// TODO Auto-generated constructor stub
	}

	//methods
	public void OpeningMessage() {
		System.out.println("Tablet hey!");
	}
	
	public void ClosingMessage() {
		System.out.println("Thank you for using Tablet!");
	}

	@Override
	void OS() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}

	@Override
	void Manufacturer() {
		// TODO Auto-generated method stub
		System.out.println("Apple Inc.");
	}

	@Override
	void GadgetType() {
		// TODO Auto-generated method stub
		System.out.println("I-Pad");
	}




}
