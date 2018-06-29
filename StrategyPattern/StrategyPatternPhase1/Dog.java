
public class Dog extends Animal{

	@Override
	public void display() {
		System.out.println("This is a dog...");
	}
	
	@Override
	public void move() {
		System.out.println("Dog moving...");
	}

	@Override
	public void fly() {
		System.out.println("Can't fly...");
		
	}

}
