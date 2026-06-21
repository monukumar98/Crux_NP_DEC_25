package Lec44;

import java.util.Arrays;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(Single(arr)));

	}

	public static int[] Single(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		int mask = xor & (-1 * xor);
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & mask) != 0) {
				a = a ^ nums[i];
			}
		}
		int b = xor ^ a;
		return new int[] { a, b };
	}

}
