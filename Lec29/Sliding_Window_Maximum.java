package Lec29;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
	}

	public static int[] Window_Maximum(int[] nums, int k) {
		int n = nums.length;
		int[] ans = new int[n - k + 1];
		int j = 0;
		Deque<Integer> dq = new ArrayDeque<>();
		// 1st window ki
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		ans[j++] = nums[dq.getFirst()];
		for (int i = k; i < nums.length; i++) {
			// 1. window grow
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
			// 2. wimdow shrink
			if (i - k == dq.getFirst()) {
				dq.removeFirst();
			}
			// 3. ans update
			ans[j++] = nums[dq.getFirst()];
		}
		return ans;

	}

}
