
public class Singleton {

	// This holds instance of the class
	private static Singleton instance;
	
	// prevent to create instantiation of the class from other class
	private Singleton() {}
	
	// Global point access 
	public static Singleton getInstance() {
		instance = new Singleton();
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello world, from singleton.");
	}
}




