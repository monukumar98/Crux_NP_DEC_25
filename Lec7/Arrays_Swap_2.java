package Lec7;

public class Arrays_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 6, 3, 7 };
		System.out.println(arr[0] + " " + arr[1]);// 1 2
		swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);// ?

	}

	public static void swap(int[] arr, int i, int j) {
		int c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

}
