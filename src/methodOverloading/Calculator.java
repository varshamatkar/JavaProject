package methodOverloading;

public class Calculator {
	
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.addition(10, 5);
		calculator.addition(10, 5, 5);
	}

}
