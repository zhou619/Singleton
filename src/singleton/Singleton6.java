package singleton;
/**
 * 双重检查（推荐用）
 * @author 终究
 *
 */
public class Singleton6 {
	private static volatile Singleton6 singleton;
	private Singleton6(){}
	
	public static Singleton6 getInstance(){
		if(singleton==null){
			synchronized (Singleton6.class) {
				if(singleton==null){
					singleton = new Singleton6();
					System.out.println("单例，双重检查");
				}
				
			}
		}
		return singleton;
	}
}
