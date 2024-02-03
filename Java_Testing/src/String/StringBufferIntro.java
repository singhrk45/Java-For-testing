package String;

public class StringBufferIntro {

	public static void main(String[] args) {
		
		
		String name = "Ritesh";
		
		name.concat("Singh");
		
		//System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Ritesh");
		
		//name1.append("singh");
		
		//name1.insert(4, "Singh");
		
		//name1.replace(1, 3, "singh");
		
		//name1.delete(1, 3);
		
		name1.reverse();
		System.out.println(name1);
		
		

	}

}
