package constructors;

public class Constructors {
	
	public Constructors() {
		System.out.println("This is constructor block");
	}
	
	public void method() {
		System.out.println("This is Method block");
	}
	
	public static void main(String[] args) {
		Constructors obj = new Constructors();   //constructor will be called automatically when object is created
		
		obj.method();      //method will be called
	}

}
