
// Examples of This Keyword

public class StudentDemo {
	
	int rollnumer;
	String name;
	String Standard;
	
	public StudentDemo(int rollnumer, String name, String Standard) {
		this.rollnumer = rollnumer;
		this.name = name;
		this.Standard = Standard;
	}
	
	public void display() {
		System.out.println(rollnumer + "," + name + "," + Standard);
	}

	public static void main(String[] args) {
		StudentDemo std = new StudentDemo(10, "RK", "5th");

		StudentDemo std1 = new StudentDemo(11, "Rs", "6th");

		std.display();
		std1.display();
	}

}
