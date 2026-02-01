package Assignement_2;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Boston(n));
	}

	public static int Boston(int n) {
		int i = 2;
		int ans = 0;// prime factor ke digit ka sum
		int sum1 = sumofdigit(n);// 378
		while (n > 1) {
			if (n % i == 0) {
				ans = ans + sumofdigit(i);
				n = n / i;
			} else {
				i++;
			}
		}
		if (ans == sum1) {
			return 1;
		} else {
			return 0;
		}

	}

	public static int sumofdigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}

}
