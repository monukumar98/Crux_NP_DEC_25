package Lec3;

public class Pattern16 {
	public static void main(String[] args) {
		int n = 5;// user input
		int row = 1;
		int star = n;
		int space = n - 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// Mirror
			if (row < n) {// mirror wale line se pehle
				star--;
				space--;
			} else {
				star++;
				space++;
			}
			// next row prep
			row++;
			System.out.println();
		}

	}
}
