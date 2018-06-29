
public class SingletonClient {
	public static void main(String args[]) {
		Singleton testObject = Singleton.getInstance();
		Singleton testObject2 = Singleton.getInstance();
		
		System.out.println(testObject.toString());
		System.out.println(testObject2.toString());
	}
}
