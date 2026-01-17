package Lec7;

public class Sum_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		System.out.println(sum(arr, 2, 5));
	}

	public static int sum(int[] arr, int i, int j) {
		int ans = 0;
		// TODO Auto-generated method stub
		for (int k = i; k <= j; k++) {
			ans = ans + arr[k];
		}
		return ans;

	}

}
