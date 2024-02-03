package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println("first try block");
			
			String text = "Ritesh";
			System.out.println(text.length());
			
			try {
				
				System.out.println("Second try block");
				
				int value = 100/0;
				
				try {
					System.out.println("third try block");
					int[] array = new int[3];
					array[5] = 8;
				}catch(Exception e) {
					System.out.println("End of third try block");
					e.printStackTrace();
				}
				
			}catch(Exception e) {
				System.out.println("End of second try block");
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			
			System.out.println("End of first try block");
			e.printStackTrace();
			
		}

	}

}
