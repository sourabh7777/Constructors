package constructors;

public class OverloadingArgumentType {
	
	//constructor1
	public OverloadingArgumentType(int a , int b , int c) {
		System.out.println("constructor with (int,int,int) argument is called");
		System.out.println(a+b+c);
	}
	
	//constructor2
	public OverloadingArgumentType(float a , int b , float c) {
		System.out.println("constructor with (float,int,float) argument is called");
		System.out.println(a+b+c);
	}
	
	//display method
	public void display() {
		System.out.println("display method is called");
	}
	
	public static void main(String[] args) {
		OverloadingArgumentType obj1 = new OverloadingArgumentType(10,20,30);
		obj1.display();
		
		OverloadingArgumentType obj2 = new OverloadingArgumentType(10.2f,20,30.2f);
		obj2.display();
	}

}
