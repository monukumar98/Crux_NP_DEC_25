package Reursion_Doubt;

public class Maximum_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 1, 2, 3 };
		System.out.println(Maximum(arr, 0));

	}

	public static int Maximum(int[] arr, int i) {
		if(i==arr.length) {
			return Integer.MIN_VALUE;
		}
		// 
		int max=Maximum(arr, i+1);
		return Math.max(max, arr[i]);
				

	}

}
