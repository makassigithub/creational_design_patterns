package abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		//Client does not know the factory that is returned
		
		//get MaturedStudentFactory base on the specs
		AbstractStudentFactory asf1 = AbstractStudentFactory.getStudentFactory(55);
							   System.out.println(asf1.getStudentTuitionFee(AccademicLevels.BEGINNER));
		
		//get TeenageStudentFactory base on the specs
		AbstractStudentFactory asf2 = AbstractStudentFactory.getStudentFactory(25);
							   System.out.println(asf2.getStudentTuitionFee(AccademicLevels.ADVANCED));
	    
		//get ChildStudentFactory base on the specs
		AbstractStudentFactory asf3 = AbstractStudentFactory.getStudentFactory(5);
							   System.out.println(asf3.getStudentTuitionFee(AccademicLevels.INTERMEDIATE));

	}

}
