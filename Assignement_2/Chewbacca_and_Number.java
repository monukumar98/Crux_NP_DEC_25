package Assignement_2;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		System.out.println(number(x));

	}

	public static long number(long x) {
		long mul = 1;// 10^0
		long ans = 0;
		while (x > 9) {// single digit
			long rem = x % 10;
			if (rem >= 5) {
				rem = 9 - rem;
			}
			ans = ans + rem * mul;
			mul = mul * 10;
			x = x / 10;

		}

		if(x>=5 && x!=9) {// single digit
			x=9-x;
		}
		ans = ans + x * mul;
		return ans;
	}

}



