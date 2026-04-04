package Lec24;

public class Method_Overloading {
	public static void main(String[] args) {

		System.out.println(add(2, 8));
		System.out.println(add(2, 7, 9));
		System.out.println(add(2, 7, 9.1));
		System.out.println(add(2, 7, 9, 2, 3, 2, 3, 2, 2, 1, 7, 2, 1, 1, 1, 2, 3));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(int x,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;

	}

}
