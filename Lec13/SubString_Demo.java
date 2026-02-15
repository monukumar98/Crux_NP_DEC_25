package Lec13;

public class SubString_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		System.out.println(s.substring(2, 6));
		System.out.println(s.substring(2));
		// System.out.println(s.substring(2,2));
		print(s);

	}

	public static void print(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}

}
