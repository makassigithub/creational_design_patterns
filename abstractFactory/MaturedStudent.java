package abstractFactory;

public class MaturedStudent extends Student {

	@Override
	protected StudentType getType() {
		return StudentType.MATURED;
	}

}
