package Lec29;

public class Maximum_Sum_of_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 2, 1 };
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));
	}

	public static int Maximum_Sum(int[] arr, int k) {
		// 1st. window ka answer
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		int ans = sum;
		for (int i = k; i < arr.length; i++) {
			// 1. window grow
			sum += arr[i];
			sum -= arr[i - k];	// 2. window shrink
		
			// 3. answer update
			ans = Math.max(ans, sum);

		}
		return ans;

	}

}
