package Oops;

public class MedicalClass implements Student{

	@Override
	public void displayName() {
		System.out.println("we are from medical");
		
	}

	@Override
	public void getStudentNumber() {
		System.out.println("we are 120 students");
		
	}

	@Override
	public void getStandard() {
		System.out.println("we are from MBBS");
		
	}
	
	public void getUniversity() {
		System.out.println("london university");
	}
	
	@Override
	public void getInterfaceName() {
		
		
	}

	public static void main(String [] args) {
		EngineeringClass eng = new EngineeringClass();
		MedicalClass med = new MedicalClass();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUniversity();
		
		System.out.println("=====================");
		
		med.displayName();
		med.getStandard();
		med.getStudentNumber();
		med.getUniversity();
	}
	
}
