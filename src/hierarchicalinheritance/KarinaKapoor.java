package hierarchicalinheritance;

public class KarinaKapoor extends Rajkapoor{
	public  void dance() {
	        System.out.println("Karina Kapoor is dancing gracefully.");
	    }
	
	public static void main(String[] args) {
	KarinaKapoor karina=new KarinaKapoor();
	karina.displayInfo();
	karina.introduce();
	karina.dance();
	
	}
}
