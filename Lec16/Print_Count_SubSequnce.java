package Lec16;

public class Print_Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		// Print(ques, "");
		System.out.println("\n"+Print(ques, ""));

	}

	public static int Print(String ques, String ans) {// abc,""
		if (ques.length() == 0) {
			System.out.print(ans + " ");

			return 1;
		}
		char ch = ques.charAt(0);// 'a'
		int x = Print(ques.substring(1), ans);
		int y = Print(ques.substring(1), ans + ch);
		return x + y;

	}

//	static int c = 0;
//
//	public static void Print(String ques, String ans) {// abc,""
//		if (ques.length() == 0) {
//			System.out.print(ans + " ");
//			c++;
//			return;
//		}
//		char ch = ques.charAt(0);// 'a'
//		Print(ques.substring(1), ans);
//		Print(ques.substring(1), ans + ch);
//
//	}
}
