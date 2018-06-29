
public class Person extends Animal{
	public Person() {
		setSoundStrategy(new Speak());
		setMoveStrategy(new WalkOnTwoLegs());
		setFlyStrategy(new CantFly());
	}
	
	public void display() {
		System.out.println("Yep, I'm a person...");
	}
}
