
public class Dog extends Animal{
	public Dog() {
		setSoundStrategy(new Bark());
		setFlyStrategy(new CantFly());
		setMoveStrategy(new WalkonFourLegs());
	}
	
	public void display() {
		System.out.println("This is a dog...");
	}
}
