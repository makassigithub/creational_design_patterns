package factory;

public class DogFamily extends Family {

	@Override
	public void createFamily() {
		Member maleDog = new MaleDog();
		maleDog.setType("dog");
		maleDog.setAge(3);
		Member femaleDog = new FemaleDog();
		femaleDog.setType("dog");
		femaleDog.setAge(6);
		
		members.add(maleDog);
		members.add(femaleDog);
	}

}
