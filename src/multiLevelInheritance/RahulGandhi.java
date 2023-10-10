package multiLevelInheritance;

public class RahulGandhi extends RajivGandhi{
	
	public void MP()
	{
		System.out.println("bharat jodo yatra.....");
	}
	
	public static void main(String[] args) {
		
		RahulGandhi obj=new RahulGandhi();
		
		obj.computers();
		
		obj.emergency();
		
	}
}