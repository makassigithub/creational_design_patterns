package factory;

public class FamilyFactory {
	
	//This is called a factory method
	public static Family getFamily(FamilyType type) {
		switch (type) {
		case HUMAN:
			return new HumanFamily();
		case DOG:
			return new DogFamily();
		default:
			return null;
		}
	}
}
