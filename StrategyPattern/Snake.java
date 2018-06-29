
public class Snake extends Animal {
	public Snake() {
		setSoundStrategy(new Hiss());
		setFlyStrategy(new CantFly());
		setMoveStrategy(new Crawl());
	}
	
	public void display() {
		System.out.println("This is a snake...");
	}
}
