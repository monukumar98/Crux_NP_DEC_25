package Lec44;

public class magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;

	}

	public static int Nth_Number(int n) {
		int mul = 5;
		int sum = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				sum = sum + mul;
			}
			mul = mul * 5;
			n >>= 1;// n = n>>1;
		}
		return sum;
	}

}
