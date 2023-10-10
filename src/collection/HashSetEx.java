package collection;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> obj=new HashSet<Double>();
		obj.add(10.10);
		obj.add(20.10);
		obj.add(30.10);
		obj.add(40.10);
		obj.add(50.10);
		System.out.println(obj);
		
		
		
		System.out.println();
		//calculate total length of Hashset
		System.out.println(obj.size());
	
		System.out.println();	
	obj.remove(50.10);
	System.out.println(obj);
		
		
//		obj.clear();
//		System.out.println(obj);
		System.out.println();
		System.out.println(obj.contains(30.10));
		
		System.out.println();
		
		//second approach
		for(double v:obj) {
			System.out.println(v);
		}

	}

}
