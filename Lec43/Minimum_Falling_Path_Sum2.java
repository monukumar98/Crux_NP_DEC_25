package Lec43;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -100000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(matrix, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] matrix, int cr, int cc, int[][] dp) {
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if (dp[cr][cc] != -100000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < dp.length; col++) {
			if (col != cc) {
				ans = Math.min(ans, Falling_Path_Sum(matrix, cr + 1, col, dp));
			}
		}
		return dp[cr][cc]=ans+matrix[cr][cc];

	}

}
