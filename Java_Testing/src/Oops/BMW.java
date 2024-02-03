
//Examples of inheritance and super keyword

package Oops;

public class BMW extends Car {
	
	BMW(){
		//super();
		System.out.println("BMW constrctor");
	}
	
	 String name = "BMW";
	 
	 //public void setWheels() {
			//System.out.println("Only 4 wheels are allowed");
	//}
	 
	 public void getName() {
		 System.out.println(name);
		 System.out.println(super.name);
	 }
	 
	 public void run() {
		 System.out.println("BMW is running");
		 super.run();
	 }
	
	public static void main(String[] args) {
		
		//Car car = new Car();
		//System.out.println(name);
		//car.run();
		
		BMW bmw = new BMW();
		bmw.run();
	}

}
