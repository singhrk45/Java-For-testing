

//example of class and objects

public class Dog {
	
	String name = "Jack";
	String bread = "bulldog";
	String height = "4";
	
	public void barking() {
		System.out.println(name + " is barking");
	}
	
	public void eating() {
		System.out.println(name + " is eating");
	}

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Dog dog2 = new Dog();
		
		System.out.println(dog.height);
		
		dog.barking();
		dog.eating();

		dog2.eating();
	}

}
