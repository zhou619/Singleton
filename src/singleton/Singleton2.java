package singleton;

/**
 * 饿汉式（静态常量）【可用】
 * 
 * @author 终究
 *
 */
public class Singleton2 {
	private final static Singleton2 INSTANCE = new Singleton2();

	private Singleton2(){}
	
	public static Singleton2 getInstance(){
		return INSTANCE;
	}
}
