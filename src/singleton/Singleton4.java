package singleton;
/**
 * 懒汉式（线程安全，同步方法）【不推荐用】
 * @author 终究
 *
 */
public class Singleton4 {
	private static Singleton4 singleton;
	
	private Singleton4(){}
	public static synchronized Singleton4 getInstance(){
		if(singleton==null){
			singleton=new Singleton4();
		}
		return singleton;
	}
	
}
