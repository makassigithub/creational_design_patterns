package factory;

public class TestFactory {

	public static void main(String[] args) {
		Family humanFamily = FamilyFactory.getFamily(FamilyType.HUMAN);
		System.out.println(humanFamily.getMembers());
		
		Family dogFamily = FamilyFactory.getFamily(FamilyType.DOG);
		System.out.println(dogFamily.getMembers());
		
		System.out.println(FamilyFactory.getFamily(FamilyType.UNKNOWN));	

	}

}
