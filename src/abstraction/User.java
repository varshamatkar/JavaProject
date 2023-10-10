package abstraction;

public class User extends Atm{
	
	
	public void authontication() {
		System.out.println("validating password");
		
	}
	
	public void changPin() {
		System.out.println("successfully change the pin");
	}

	public static void main(String[] args) {
		
		 User obj=new User();
		 obj.authontication();
		 obj.changPin();
		 obj.widraw();
		

	}

	

}
