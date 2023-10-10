package variable;

public class A {
	
String s1="varsha";
	

public void add(){
		
 String s="Sherya";//Local Variable
 System.out.println(s);
 System.out.println(s1);


	}
	

public static void main(String[] args) {
	A a= new A();
    System.out.println(a.s1);	
    a.add();
	

	}

}
