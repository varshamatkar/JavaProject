package collection;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Pune");
		obj.add("Mumbai");
		obj.add("Delhi");
		obj.add("A'Nagar");
		obj.add("Aurangabad");

		System.out.println(obj);
		
		System.out.println();
		//remove element from arraylist
		obj.remove(3);
		System.out.println(obj);
		System.out.println();
		
		//insertion
		obj.add(1, "Solapur");
		System.out.println(obj);
		
		System.out.println();
		
		
		//obj.clear();
		//System.out.println();
		
		
		//check element is present or not
		System.out.println(obj.contains("Pune"));
		
		System.out.println();
		
		
		
		//second approach
				for(int i=0;i<obj.size();i++) {
					System.out.println(obj.get(i));
				}
				
				System.out.println();
		
			//Third approach	
				for(String v:obj) {
					System.out.print(v+" ");
				}
		
	}

}
