//Strategy Pattern defines a family of algorithms, encapsulates each one,
//and makes them interchangable. Strategy lets the algorithm vary
//independently from clients that use it.

public class Client {
	public static void main(String args[]) {
		Animal person = new Person();
		
		person.fly();
		person.makeSound();
		person.setFlyStrategy(new FlyOnJetpack());
		person.fly();
		
		Animal dog = new Dog();
		dog.fly();
		dog.setFlyStrategy(new FlyOnJetpack());
		dog.fly();
		dog.move();
		dog.makeSound();
	}
}
