
public class Eagle extends Animal {
	public Eagle() {
		setSoundStrategy(new Scream());
		setFlyStrategy(new CanFly());
		setMoveStrategy(new WalkOnTwoLegs());
	}
	
	public void display() {
		System.out.println("This is an eagle...");
	}
}
