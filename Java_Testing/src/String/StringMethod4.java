package String;

public class StringMethod4 {

	public static void main(String[] args) {
		
		String text = "United State";
		
		System.out.println(text.substring(5));
		System.out.println(text.substring(2, 5));
		
		char[] charArray = text.toCharArray();
		
		System.out.println(text);
		
		for(int i = 0; i<charArray.length; i++) {
			System.out.println(charArray[i]);
		}

		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		
		String text1 = "   United State     ";
		String text2 = "Ritesh";
		
		System.out.println(text1+text2);
		System.out.println(text1.trim() + text2);
		System.out.println(text1.trim() + text2.trim());
		
	}

}
