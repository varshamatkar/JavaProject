package conditionalStatements;

public class LadderIfExample {

	public static void main(String[] args) {
		
		double percentage=55.29;
		
		if(percentage>=75) {
			System.out.println("Distinction");
			
		}
		else if(percentage>=60&&percentage<75){
			System.out.println("First class");
			
			
		}
		else if(percentage>=40&& percentage<60) {
			System.out.println("pass");
		}
		
		else {
			System.out.println("Fail");
		}

	}

}
