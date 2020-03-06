 package prototype;

public class TestPrototype {
	
	public static void main(String ...args) {
		Registry registry = new Registry();
		Man man1 = (Man)registry.createPerson("man");
			man1.setAge(40);
			man1.setName("Bouki");
			man1.setAge(30);
		Man man2 = (Man)registry.createPerson("man");
			man2.setAge(40);
			man2.setName("Zambo");
			man2.setAge(50);
		
		/*The prototype is shallowed copy to create objects 
		 * Therefore, object created from the same prototype share the same
		 * memory address for there are member object.
		 * */
		
		System.out.println("man1.country: "+man1.getCountry());
		System.out.println("man2.country: "+man2.getCountry());
		
		/*
		 * Instances form the same prototype are unique and distinct object from
		 * The client side. the heavy memory utilisation stays on the client side
		 * */
		
		System.out.println("man1: "+man1);
		System.out.println("man2: "+man2);
		
	}

}
