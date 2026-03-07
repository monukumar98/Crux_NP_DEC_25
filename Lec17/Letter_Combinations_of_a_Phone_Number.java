package Lec17;

public class Letter_Combinations_of_a_Phone_Number {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="23";
		Key_Paid(ques, "");

	}

	public static void Key_Paid(String ques, String ans) {// 293,""
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);// '2'
		String get = key[ch - '0'];
		for (int i = 0; i < get.length(); i++) {
			Key_Paid(ques.substring(1), ans + get.charAt(i));
		}

	}

}

