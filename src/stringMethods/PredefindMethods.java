package stringMethods;

public class PredefindMethods {

	public static void main(String[] args) {
		
			String s="varsha matkar";
			
			String s1="VARSHA MATKAR";
			
			System.out.println(s.length());
			
			System.out.println(s.charAt(10));
			
		   //System.out.println(s.charAt(15));
			
			System.out.println(s.substring(5));
			
			System.out.println(s.substring(7));
			
			System.out.println(s.substring(0, 7));
			
			System.out.println(s.equals(s1));
			
			System.out.println(s.equalsIgnoreCase(s1));
			
			System.out.println(s.concat(" "+s1));
			
			System.out.println(s.indexOf('r'));
			
			System.out.println(s.replace('v', 'H'));
			
			System.out.println(s);
			
			System.out.println(s.trim());
			
			System.out.println(s.startsWith("v"));
			
			System.out.println(s.startsWith("z"));
			
			System.out.println(s.startsWith("var"));
			
			System.out.println(s.startsWith("varsh"));
			
			System.out.println(s.endsWith("c"));
			
			System.out.println(s.endsWith("kar"));
		}

	}
	


