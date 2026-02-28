package Reursion_Doubt;

public class Get_the_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Maximum_Score(int[] arr1, int[] arr2) {
		long mod = 1000_000_007;
		int i = 0, j = 0, s1 = 0, s2 = 0;
		long ans = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				long sum1 = sum(arr1, s1, i);
				long sum2 = sum(arr2, s2, j);
				ans = (ans + Math.max(sum1, sum2));
				i++;
				j++;
				s1 = i;
				s2 = j;

			}
		}
		long sum1 = sum(arr1, s1, arr1.length - 1);
		long sum2 = sum(arr2, s2, arr2.length - 1);
		ans = (ans + Math.max(sum1, sum2)) % mod;
		return (int) (ans);

	}

	public static long sum(int[] arr1, int si, int ei) {
		// TODO Auto-generated method stub

		long sum = 0;
		for (int i = si; i <= ei; i++) {
			sum = (sum + arr1[i]);
		}
		return sum;
	}

}
