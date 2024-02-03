package Oops;

public class EngineeringClass implements Student {

	@Override
	public void displayName() {
		System.out.println("we are from engineering");
		
	}

	@Override
	public void getStudentNumber() {
		System.out.println("we are 120 students");
		
	}

	@Override
	public void getStandard() {
		System.out.println("we are from cse");
		
	}
	
	public void getUniversity() {
		System.out.println(Student.university);
	}

	@Override
	public void getInterfaceName() {
		
		
	}

}
