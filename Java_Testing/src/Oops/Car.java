
//Examples of inheritance

package Oops;

public class Car {
	
	Car(){
		System.out.println("constructor os car class");
	}
	
	public final void setWheels() {
		System.out.println("Only 4 wheels are allowed");
	}
	
	String name = "Car segment";

	public void run() {
		System.out.println("car is running");
	}

}
