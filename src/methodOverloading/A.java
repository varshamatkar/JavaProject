package methodOverloading;

public class A {

	
		public void add()
		{
			System.out.println("this is no-arg method");
		}
		
		public void add(int x)
		{
			System.out.println("this is int arg method");
		}
		
		public void add(int z, int y)
		{
			System.out.println(z+y);
		}

		public static void main(String[] args) {
			
			A obj=new A();
			
			obj.add();
			
			obj.add(100);
			
			obj.add(10, 10);
			
			//obj.add('a', 'b', 'c');
			
			//obj.add(20.2);  ......//AP is not possible....
					

		}

	}