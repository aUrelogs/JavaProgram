package JavaFinals;

public  class Class_C1 extends Class_P{

	//Cellphone

	String chargerType;
	
	Class_C1(String unit, String size, String color, String touchscreen, String camera, String storage, String chargerType) {
		super(unit, size, color, touchscreen, camera, storage);
		this.chargerType = chargerType;
		
		// TODO Auto-generated constructor stub
	}

	
	
	//methods
		public void OpeningMessage() {
			System.out.println("SamSang User, Welcome!");
		}
		
		public void ClosingMessage() {
			System.out.println("Thank you for using SamSang!");
		}



		@Override
		void OS() {
			// TODO Auto-generated method stub
			System.out.println("Android");
		}



		@Override
		void Manufacturer() {
			// TODO Auto-generated method stub
			System.out.println("Xiaomi China");
		}



		@Override
		void GadgetType() {
			// TODO Auto-generated method stub
			System.out.println("Mobile Phone");
		}




	

	
}
