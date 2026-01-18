package Lec7;

public class Find_Pivot_Index2 {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(Pivot_Index(arr));

	}

	public static int Pivot_Index1(int[] arr) {
		int totalsum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalsum += arr[i];
		}
		int left = 0;
		for (int i = 0; i < arr.length; i++) {
			int right = totalsum - left - arr[i];
			if (left == right) {
				return i;
			}
			left = left + arr[i];
		}
		return -1;

	}

	public static int Pivot_Index(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];// prefix

		left[0] = 0;// no need
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] + arr[i - 1];
		}
		int[] right = new int[n];// Suffix
		right[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i + 1];
		}
		// calculation
		for (int i = 0; i < n; i++) {
			if (left[i] == right[i]) {
				return i;
			}
		}
		return -1;

	}

}
