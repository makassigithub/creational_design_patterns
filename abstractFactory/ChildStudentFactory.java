package abstractFactory;

public class ChildStudentFactory extends AbstractStudentFactory {

	@Override
	protected int getStudentTuitionFee(AccademicLevels level) {
		switch (level) {
		case BEGINNER:
			return 1000;
		case INTERMEDIATE:
			return 2000;
		case ADVANCED:
			return 3000;
		default:
			return -1;
		}
	}

}
