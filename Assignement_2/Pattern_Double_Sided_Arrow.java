package Assignement_2;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space1 = n - 1;
		int space2 = -1;
		int row = 1;
		int val = 1;
		while (row <= n) {
			// space1
			int i = 1;
			while (i <= space1) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				p--;
				j++;
			}
			// space2
			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}
			// star
			int m = 1;
			p++;
			if (row == 1 || row == n) {
				m = 2;
			}
			while (m <= star) {
				System.out.print(p + " ");
				p++;
				m++;
			}

			// Mirror
			if (row < n / 2 + 1) {
				star++;
				space1 -= 2;
				space2 += 2;
				val++;
			} else {
				star--;
				space1 += 2;
				space2 -= 2;
				val--;
			}
			row++;
			System.out.println();
		}
	}

}
