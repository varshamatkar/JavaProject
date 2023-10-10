package hierarchicalinheritance;

public class RanbeerKapoor extends Rajkapoor{

	public void engageWithFans() {
        System.out.println("Ranvir Kapoor is interacting with his fans.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RanbeerKapoor ranbeerKapoor = new RanbeerKapoor();
		ranbeerKapoor.displayInfo();
		ranbeerKapoor.introduce();
		ranbeerKapoor.engageWithFans();
		
	}

}