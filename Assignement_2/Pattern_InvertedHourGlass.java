package Assignement_2;

import java.util.Scanner;


public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = 2 * n - 1;
		int row = 1;
		while (row <= 2 * n + 1) {
			// star
			int v = n;
			int i = 1;
			while (i <= star) {
				System.out.print(v + " ");
				v--;
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k = 1;
			v++;
			if (row == n + 1) {
				k = 2;
				v++;
			}
			while (k <= star) {
				System.out.print(v+" ");
				v++;
				k++;
			}
			// mirror
			if (row < n + 1) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}
			// next line
			row++;
			System.out.println();
		}

	}

}
