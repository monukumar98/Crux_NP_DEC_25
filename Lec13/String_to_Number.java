package Lec13;

public class String_to_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "124";
		System.out.println(Number(s));
		int n = Integer.parseInt(s);
		long l = Long.parseLong(s);
	}

	public static int Number(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			sum = sum * 10 + (ch - '0');
		}
		return sum;
	}

}
