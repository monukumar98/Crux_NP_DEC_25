package Lec15;

public class Arrays_is_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 7, 6, 8 };

	}

	public static  boolean Is_Sorted(int []arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return Is_Sorted(arr, i+1);
		
	}

}
