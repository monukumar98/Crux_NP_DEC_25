package Lec15;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int x = 4;
		System.out.println(pow(a, x));

	}

	public static int pow(int a, int x) {
		if (x == 0) {
			return 1;
		}
		int p = pow(a, x - 1);
		return p * a;

	}

}
