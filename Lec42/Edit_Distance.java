package Lec42;

import java.util.Arrays;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "horse", word2 = "ros";
		int [] [] dp = new int [word1.length()][word2.length()];
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(mini_Opr(word1, word2, 0, 0, dp));
	}

	public static int mini_Opr(String word1, String word2, int i, int j, int[][] dp) {
		if (word1.length() == i) {
			return word2.length() - j;
		}
		if (word2.length() == j) {
			return word1.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (word1.charAt(i) == word2.charAt(j)) {
			ans = mini_Opr(word1, word2, i + 1, j + 1, dp);
		} else {
			int I = mini_Opr(word1, word2, i, j + 1, dp);
			int R = mini_Opr(word1, word2, i + 1, j + 1, dp);
			int D = mini_Opr(word1, word2, i + 1, j, dp);
			ans = Math.min(D, Math.min(R, I)) + 1;
		}
		return dp[i][j] = ans;

	}

}
