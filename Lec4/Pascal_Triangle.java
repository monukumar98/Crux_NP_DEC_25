package Lec4;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int star = 1;
		while (row < n) {// row
			// star
			int i = 0;
			int ncr = 1;
			while (i < star) {// i
				System.out.print(ncr + " ");
				ncr = ((row - i) * (ncr)) / (i + 1);
				// ncr = ((row - i)/ (i + 1)) * ncr ;
				i++;
			}
			// next line ki prep
			row++;
			System.out.println();
			star++;
		}

	}

}
