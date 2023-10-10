package methodOverriding;

public class Cat extends Animal{
	public void sound() {
		System.out.println("Meow, meow");
	}
	 
	public void eat() {
		System.out.println("cat can be veg+noveg");
	}
	public static void main(String[] args) {
		Cat c=new Cat();
		c.sound();
		c.eat();
	}

}
