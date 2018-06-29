
public class Animal {
	private Sound soundStrategy;
	private Move moveStrategy;
	private Fly flyStrategy;
	
	public void makeSound() {
		soundStrategy.makeSound();
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void fly() {
		flyStrategy.fly();
	}

	public void setSoundStrategy(Sound soundStrategy) {
		this.soundStrategy = soundStrategy;
	}

	public void setMoveStrategy(Move moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	public void setFlyStrategy(Fly flyStrategy) {
		this.flyStrategy = flyStrategy;
	}
}
