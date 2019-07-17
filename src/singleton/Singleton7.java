package singleton;

/**
 * 静态内部类（推荐用） 类的静态属性只会在第一次加载类的时候初始化，JVM帮助我们保证了线程的安全性， 在类进行初始化时，别的线程时无法进入的。
 * 优点：线程安全，延迟加载，效率高
 * 
 * @author 终究
 *
 */
public class Singleton7 {

	String name = "静态内部类";

	private Singleton7() {}

	private static class SingletonInstance {
		private static final Singleton7 INSTANCE = new Singleton7();
	}

	public static Singleton7 getInstance() {
		System.out.println("单例，静态内部类实现");
		return SingletonInstance.INSTANCE;
	}
}
