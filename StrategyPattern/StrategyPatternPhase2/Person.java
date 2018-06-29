
public class Person implements Movable, MakeSound{

	@Override
	public void move() {
		System.out.println("Person Moving...");
	}

	@Override
	public void makeSound() {
		System.out.println("Yes, I speak");
		
	}
	
}
