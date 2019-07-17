package singleton;
/**
 * 懒汉式（线程不安全）【不可用】
 * @author 终究
 *
 */
/**
 *基本实现思路：
 *单例模式要求类能够有返回对象一个引用（永远是同一个）和一个获得该实例的方法（必须是
 *静态方法，通常使用getInstance这个名称）。
 *单例的实现主要是通过以下两个步骤：
 *	1，将该类的构造方法定义为私有方法，这样其他处的代码就无法通过调用该类的构造方法
 *	来实例化该类的对象，只有通过该类提供的静态方法来得到该类的唯一实例；
 *	2，在该类内提供一个静态方法，当我们调用这个方法时，如果类持有的引用不为空就返回
 *	这个引用，如果类保持的引用为空就创建该类的实例并将实例的引用赋予该类保持的引用。
 * @author 终究
 *
 */
public class Singleton {
	private static Singleton singleton;
	private Singleton () {}
	public static Singleton getSingleton(){
		if (singleton==null){
		singleton = new Singleton();
		System.out.println("这是单例设计模式");
		}
		return singleton;
	}

}