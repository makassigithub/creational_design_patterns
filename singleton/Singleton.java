package singleton;

public class Singleton {
    
	//Ensure Lazy loading;
	private static Singleton singleton = null;
	
	public static  Singleton getInstance() {
		if(singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
			
		}
		return singleton;
	}
	
	// prevent instanciation with the new keyword, even by reflexion
	private Singleton() {
		if(singleton != null) {
			throw new RuntimeException("Use GetInstance method");
		}
		
	}
}
