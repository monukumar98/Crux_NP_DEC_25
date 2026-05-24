package Lec36;

public class StringBuilder_vs_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo();
		// StringBuilderDemo();
	}

	public static void StringBuilderDemo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}

	}

	public static void StringDemo() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}
	}

}
