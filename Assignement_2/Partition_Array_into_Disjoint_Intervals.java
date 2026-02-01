package Assignement_2;

public class Partition_Array_into_Disjoint_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 0, 3, 8, 6 };

	}

	public static int Partition_Array_into_Disjoint(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.min(right[i + 1], arr[i]);

		}
		for (int i = 1; i < right.length; i++) {
			if (left[i - 1] <= right[i]) {
				return i;
			}
		}
		return 0;
	}

}
