package factory;

public class HumanFamily extends Family {

	@Override
	public void createFamily() {
		Member man = new Man();
		man.setType("human");
		man.setAge(30);

		Member woman = new Woman();
		woman.setType("human");
		woman.setAge(30);

		members.add(man);
		members.add(woman);

	}

}
