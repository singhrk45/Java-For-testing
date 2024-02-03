package String;

public class StringIntro {

	public static void main(String[] args) {
	
		//same
		String name = "Ritesh Singh";
		String name1 = "Ritesh Singh";
		String name2 = "ritesh singh";
		
		//different
		//String country = new String("United states");
		//String country1 = new String("United states");
		
		//System.out.println(name);
		
		//System.out.println(country);
		
		//System.out.println(name1);
		
		//System.out.println(name.equals(name1));
		//System.out.println(name.equals(name2));
		
		//System.out.println(name.equalsIgnoreCase(name2));

		//System.out.println(country.equals(country1));
	
		
		//System.out.println(name == name1);
		//System.out.println(country == country1);
		
		String finalString = name + name1 + name2;
		
		System.out.println(finalString);
		
		String secString = name.concat(name1.concat(name2));
		
		System.out.println(secString);
		
	}
	

}
