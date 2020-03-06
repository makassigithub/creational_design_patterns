package abstractFactory;

public class TeenageStudentFactory extends AbstractStudentFactory {
	@Override
	protected int getStudentTuitionFee(AccademicLevels level) {
		switch (level) {
		case BEGINNER:
			return 1500;
		case INTERMEDIATE:
			return 2500;
		case ADVANCED:
			return 3500;
		default:
			return -2;
		}
	}
}
