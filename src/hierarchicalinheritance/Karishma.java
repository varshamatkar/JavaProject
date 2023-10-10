package hierarchicalinheritance;

public class Karishma extends Rajkapoor {
	public  void act() {
	        System.out.println("Karishma Kapoor is giving a captivating performance.");
	    }

public static void main(String[] args) {	
Karishma k=new Karishma();
k.displayInfo();
k.introduce();
k.act();
	}

}
