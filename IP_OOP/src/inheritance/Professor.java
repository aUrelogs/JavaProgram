package inheritance;

public class Professor extends Person{

	String bachelorDegree;
	
	Professor(String fname, String lname, int age, String bday, String bachelorDegree){
		super(fname, lname, age, bday);
		
	
	}
	
	
	public void encodeGrade() { 
		System.out.println("I am encoding Grades");
	}
	
}
