package Lec12;

public class Two_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][3];
		int[][] arr1 = new int[4][];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][2]);
		int[][] other = arr;
		// row
		int row = arr.length;
		int col = arr[0].length;

	}

}
