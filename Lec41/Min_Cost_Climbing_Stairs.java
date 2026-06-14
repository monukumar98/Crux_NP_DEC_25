package Lec41;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] dp = new int[cost.length];
		Arrays.fill(dp, -1);
		int zero = Min_Cost(cost, 0, dp);
		int first = Min_Cost(cost, 1, dp);
		System.out.println(Math.min(zero, first));
	}

	public static int Min_Cost(int[] cost, int i, int[] dp) {
		if (i >= cost.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int step_1 = Min_Cost(cost, i + 1, dp);
		int step_2 = Min_Cost(cost, i + 2, dp);
		return dp[i] = Math.min(step_1, step_2) + cost[i];

	}
}
