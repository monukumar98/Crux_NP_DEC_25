package Reursion_Doubt;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int x = sc.nextInt();
			arr = new_arr(arr, x);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum % 1000000007);

	}

	public static int[] new_arr(int[] arr, int x) {
		// TODO Auto-generated method stub
		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			int j = i - x;
			if (j < 0) {
				j += arr.length;
			}
			temp[i] = arr[i] + arr[j];
		}
		return temp;

	}

}
