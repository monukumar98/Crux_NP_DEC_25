package Reursion_Doubt;

public class Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -2 };

	}

	public static int Maximum_Sum_Circular(int[] arr) {
		int Linear_sum = Kadanes_Algorithm(arr);
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] *= -1;
		}
		int mid_sum = Kadanes_Algorithm(arr);
		int circular_sum = total_sum + mid_sum;
		if(circular_sum==0) {
			return Linear_sum;
		}
		return Math.max(Linear_sum, circular_sum);

	}

	public static int Kadanes_Algorithm(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}
}
