package constructors;

public class OverloadingArgumentNumber {
	
	public OverloadingArgumentNumber(int a , int b) {
		int sum = a+b;
		System.out.println("The sum of two number is "+ sum);
	}
	
	public OverloadingArgumentNumber(int a , int b, int c) {
		int sum = a+b+c;
		System.out.println("The sum of three number is "+sum);
	}
	

	public static void main(String[] args) {
		OverloadingArgumentNumber obj1 = new OverloadingArgumentNumber(10,20);
		
		OverloadingArgumentNumber obj2 = new OverloadingArgumentNumber(10,20,30);

	}

}
