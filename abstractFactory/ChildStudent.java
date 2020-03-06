package abstractFactory;

public class ChildStudent extends Student {

	@Override
	protected StudentType getType() {
		return StudentType.CHILD;
	}

}
