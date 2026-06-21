package Lec44;

public class PrintSubsequnce_Using_BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		print(s);

	}

	public static void print(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			Subsequnce(s, i);

		}
	}

	private static void Subsequnce(String s, int i) {
		// TODO Auto-generated method stub
		String ans = "";
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				ans = ans + s.charAt(pos);

			}
			pos++;
			i >>= 1;
		}
		System.out.println(ans);

	}

}
