
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
		
		Singleton singleton1 = Singleton.getInstance();
		singleton1.showMessage();
	}

}
