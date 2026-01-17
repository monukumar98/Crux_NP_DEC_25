package Lec7;

import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// array ki size
	//	int[] arr = new int[n];// array create kra hai bs
		int arr[] = new int[n];// array create kra hai bs
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Display(arr);

	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
