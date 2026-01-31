package Lec9;

public class Kadanes_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(SubArray_Sum(arr));
	}

	public static int SubArray_Sum(int[] arr) {
		int ans = Integer.MIN_VALUE;// -2^31
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum += arr[i];
			ans = Math.max(ans, curr_sum);
			if (curr_sum < 0) {
				curr_sum = 0;
			}
		}
		return ans;

	}

}
