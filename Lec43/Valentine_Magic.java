package Lec43;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		int[][] dp = new int[boys.length][girls.length];
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Min_Diff(boys, girls, 0, 0, dp));

	}

	public static int Min_Diff(int[] boys, int[] girls, int i, int j, int[][] dp) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 999999;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int sel = Min_Diff(boys, girls, i + 1, j + 1, dp) + Math.abs(boys[i] - girls[j]);
		int rej = Min_Diff(boys, girls, i, j + 1, dp);
		return dp[i][j] = Math.min(sel, rej);

	}

}
