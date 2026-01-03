package Lec3;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// star
			int k = 1;
			// Every row ka  start number val me hai 
			int p=val;
			while (k <= star) {
				System.out.print(p + "\t");
				if(k<star/2+1) {
				p++;
				}
				else {
					p--;
				}
				k++;
			}
			// Mirror
			if (row < n) {
				star += 2;// star=star+2;
				val++;
				space--;
			} else {
				star -= 2;// star=star-2;
				space++;
				val--;
			}
			// Next line ki prep
			row++;
			System.out.println();

		}
	}

}
