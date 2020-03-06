package abstractFactory;

public class TeenageStudent extends Student {

	@Override
	protected StudentType getType() {
		// TODO Auto-generated method stub
		return StudentType.TEENAGE;
	}

}
