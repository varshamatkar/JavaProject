package array;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "learn","coding","java","for","automation" ,"testing"};
		//Print this as a list using array
		System.out.println(s.length);
		
		System.out.println();
		
		System.out.println(Arrays.toString(s));
		
		System.out.println();
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println();
for(String str:s) {
	System.out.println(str);
}
	}

}
