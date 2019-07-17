package singleton;

public class Test {

	public static void main(String[] args) {
		Singleton.getSingleton();
		Singleton7 INSTANCE = Singleton7.getInstance();
		Singleton7 INSTANCE2 = Singleton7.getInstance();
		Singleton6.getInstance();
		System.out.println(INSTANCE.equals(INSTANCE2));
	}

}
