package Lec7;

public class Find_Pivot_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(Pivot_Index(arr));

	}
	public static int Pivot_Index(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int left_sum = sum(arr, 0, i - 1);
			int right_sum = sum(arr, i + 1, n - 1);
			if (left_sum == right_sum) {
				return i;
			}
		}
		return -1;
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




