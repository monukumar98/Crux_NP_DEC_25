package Assignement_2;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Series(n1, n2);

	}

	public static void Series(int n1, int n2) {
		// TODO Auto-generated method stub
		int i = 1;
		int count = 1;
		while (count <= n1) {
			int num = 3 * i + 2;
			if (num % n2 != 0) {
				System.out.println(num);
				count++;
			}
			i++;
		}

	}

}
