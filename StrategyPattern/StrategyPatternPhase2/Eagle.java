
public class Eagle implements Flyable, Movable, MakeSound{

	@Override
	public void makeSound() {
		System.out.println("Eagle screaming...");
		
	}

	@Override
	public void move() {
		System.out.println("Eagle is moving...");
		
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying...");
		
	}

}
