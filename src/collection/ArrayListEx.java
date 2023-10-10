package collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		System.out.println(obj);

		
		obj.remove(0);
		System.out.println(obj);
		
		obj.add(1, 100);
		System.out.println(obj);
		
		obj.set(0, 28);
		System.out.println(obj);
		 
		//obj.clear();
		//System.out.println();
		System.out.println();
		System.out.println(obj.contains(30));
		
		System.out.println();
		//second approach
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		System.out.println();
		for(int v:obj) {
			System.out.print(v+" ");
		}
		
	}

}
