package abstractFactory;

public abstract class AbstractStudentFactory {
	public static AbstractStudentFactory getStudentFactory(int studentAge) {
		if(studentAge > 40) {
			return new MaturedStudentFactory();
		}else if(studentAge >= 15 ) {
			return new TeenageStudentFactory();
		}
		return new ChildStudentFactory();
	}
	
	protected abstract int getStudentTuitionFee(AccademicLevels level);
}
