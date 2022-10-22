package JavaFinals;

public abstract class Class_P {

	//Gadget
	
		private String size; 
		private	String color;
		private String touchscreen;
		private	String camera;
		private String storage;
		private String unit;
	
		//constructor
		Class_P(String unit, String size, String color, String touchscreen, String camera, String storage){
			this.unit = unit;
			this.size = size;
			this.color = color;
			this.touchscreen = touchscreen;
			this.camera = camera;
			this.storage = storage;
		}
		//abstract method
		
				abstract void GadgetType();
				abstract void OS();
				abstract void Manufacturer();
		
		//getter & setter
		public String getSize() {
			return size;
		}
		
			public void setSize(String size) {
				this.size = size;
			}
		
		public String getCamera() {
			return camera;
		}
		
			public void setCamera(String camera) {
				this.camera = camera;
			}
		
		public String getStorage() {
			return storage;
		}
		
			public void setStorage(String storage) {
				this.storage = storage;
			}
		
		
		//methods
		public void OpeningMessage() {
			
		}
		
		public void ClosingMessage() {
			
		}
			
		
}
