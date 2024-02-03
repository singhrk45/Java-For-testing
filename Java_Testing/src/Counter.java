
//Examples of static and this keyword

public class Counter {
	
	int i = 0;
	static int j = 0;
	
	
	public Counter() {
		i++;
		j++;
		
		System.out.println(i);
		System.out.println(j);
		
	}

	public static void main(String[] args) {
		//Counter counter = new Counter();
		
		//Counter counter2 = new Counter();
		//Counter counter3 = new Counter();
		
		/*System.out.println(counter2.i);
		
		System.out.println(counter.i); //non static is belongs to the class object
		System.out.println(Counter.j); //static is belongs to the class
		*/
	}

}
