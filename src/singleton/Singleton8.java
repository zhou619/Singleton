package singleton;
/**
 * 枚举：
 * 优点：系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能
 * 缺点：当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new，
 * 	         可能会给其他开发人员造成困扰，特别是看不到源码的时候。
 * @author 终究
 *
 */
public enum Singleton8 {
	INSTANCE;
	public void whateverMethod(){
		
	}
}
