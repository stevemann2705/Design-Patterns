
public class Client {
	public static void main(String args[]) {
		Person person = new Person();
		Eagle eagle = new Eagle();
		
		person.move();
		person.makeSound();
		
		eagle.move();
		eagle.makeSound();
		eagle.fly();
	}
}
