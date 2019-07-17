package singleton;

/**
 * 饿汉式（静态代码块）【可用】
 * 
 * @author 终究
 *
 */
public class Singleton3 {
	private static Singleton3 instance;

	static {
		instance = new Singleton3();
	}

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return instance;
		
	}
}
