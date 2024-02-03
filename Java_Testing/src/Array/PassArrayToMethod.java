package Array;

public class PassArrayToMethod {
	
	public void findMin(int arr1[]) {
		int min = arr1[0];
		
		for(int i=0; i<arr1.length; i++) {
			if(min>arr1[i]) {
				min = arr1[i];
			}
		}
		
		System.out.println(min);
	}
	
	public int[] getArray() {
		
		return new int[] {12,13,56,78,90,12,34};
	}

	public static void main(String[] args) {
		PassArrayToMethod pass = new PassArrayToMethod();
		
		int arr1[] = {12,16,2,3,1,8};
		pass.findMin(arr1);
		
		int[] arr3 = pass.getArray();
		
		System.out.println(arr3[2]);

	}

}
