package Lec4;

public class Revserse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2346;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;// rev = rev + rem;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
