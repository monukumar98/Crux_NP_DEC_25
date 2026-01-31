package Lec9;

public class Maximum_SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(SubArray_Sum(arr));
	}

	public static int SubArray_Sum(int[] arr) {
		int ans = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			int curr_sum = 0;
			for (int j = i; j < arr.length; j++) {
				curr_sum += arr[j];// new subarray ka sum
				ans = Math.max(ans, curr_sum);
				
			}

		}
		return ans;

	}

}
