package Array;

public class TestArray {

	public static void main(String[] args) {
		
		int arr1[] = new int[10];
		
		arr1[0] = 12;
		arr1[1] = 13;
		arr1[2] = 14;
		arr1[3] = 15;
		arr1[4] = 16;
		arr1[5] = 17;
		arr1[6] = 18;
		arr1[7] = 19;
		arr1[8] = 20;
		
		System.out.println(arr1[4]);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int arr2[] = {10,20,30,40,50,60};
		
		System.out.println(arr2.length);

	}

}
