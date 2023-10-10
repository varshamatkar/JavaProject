package methodOverriding;

public class Child extends Parent{
	public void property()
	{
		System.out.println("land + Money+ Car");
	}
	
	public static void marry() {
		System.out.println("Karishma Kapoor");
	}
	public static void main(String[] args) {
		Child c =new Child();
		c.property();
	    Child.marry();
		
	}


}
