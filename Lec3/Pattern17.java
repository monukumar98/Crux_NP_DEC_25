package Lec3;

public class Pattern17 {
	public static void main(String[] args) {
		int n = 7;// user input
		int row = 1;
		int star = n / 2;
		int space = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
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
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			// Mirror
			if (row < n / 2 + 1) {// mirror wale line se pehle
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			// next row prep
			row++;
			System.out.println();
		}

	}
}