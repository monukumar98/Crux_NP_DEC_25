package Lec16;

public class Print_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		Print(ques, "");

	}

	public static void Print(String ques, String ans) {// abc,""
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);// 'a'
		Print(ques.substring(1), ans);
		Print(ques.substring(1), ans + ch);

	}

}
