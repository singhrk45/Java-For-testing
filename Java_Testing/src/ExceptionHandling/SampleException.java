package ExceptionHandling;

public class SampleException {

	public static void main(String[] args) {
		
		/*try {
			
			int value = 100;
		
			int result = value/0;
		
			System.out.println(result);
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			System.out.println("please choose another value to divide the integer");
			
			e.printStackTrace();
		}*/
		
		String text = null;
		try {
			System.out.println(text.length());
			
		}
		catch(Exception e) {
			System.out.println("String is null");
		}

	}

}
