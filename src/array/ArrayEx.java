package array;
import java.util.Arrays;


public class ArrayEx {

	public static void main(String[] args) {
		
		
		Double b[]= {2.50,3.50 ,4.50, 4.70};
		
		
		System.out.println(b.length);// total length
		   
		System.out.println(b[0]);
		System.out.println(b[2]);
		System.out.println(Arrays.toString(b));//print all elements from array
		
		b[1]=9.50;//replace
		
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.toString(b));
		
		System.out.println('\n');

		//second approach
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]+" ");
		}
		
		System.out.println();
		
		//third approach
		for(double k:b)
		{
			System.out.println(k);
		}
			
		
	}

}
	


