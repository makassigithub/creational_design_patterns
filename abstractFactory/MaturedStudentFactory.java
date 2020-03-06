package abstractFactory;

public class MaturedStudentFactory extends AbstractStudentFactory {
	@Override
	protected int getStudentTuitionFee(AccademicLevels level) {
		switch (level) {
		case BEGINNER:
			return 1550;
		case INTERMEDIATE:
			return 2550;
		case ADVANCED:
			return 3550;
		default:
			return -3;
		}
	}
}
