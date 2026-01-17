package Lec7;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = new int []{ 1, 2, 6, 3, 7 };
		int[] arr = { 1, 2, 6, 3, 7 };
		// System.out.println(arr.length);
		System.out.println(arr[0] + " " + arr[1]);// 1 2
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);// ?

	}

	public static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}

}
