package inheritance;

public class Student extends Person{

	Student(String fname, String lname, int age, String bday){
		super(fname, lname, age, bday);
	
		
	}
	
	public void doingAssignment() {
		
		System.out.println("Do not disturb me. I am doing assignment");
		
	}
	
	
}
