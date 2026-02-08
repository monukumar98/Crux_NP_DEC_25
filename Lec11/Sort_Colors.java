package Lec11;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		Sort(arr);
	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		int zero = 0;
		int two = arr.length - 1;
		int i = 0;
		while (i <= two) {
			if (arr[i] == 0) {
				int temp = arr[zero];
				arr[zero] = arr[i];
				arr[i] = temp;
				zero++;
				i++;
			} else if (arr[i] == 2) {
				int temp = arr[two];
				arr[two] = arr[i];
				arr[i] = temp;
				two--;

			} else {
				i++;
			}
		}

	}

}
