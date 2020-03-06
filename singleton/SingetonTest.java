package singleton;

public class SingetonTest {
	
	public static void main(String ...args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println("singleton1 :"+singleton1);
		System.out.println("singleton2 :"+singleton2);
	}

}
