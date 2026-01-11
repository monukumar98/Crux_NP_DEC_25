package Lec6;

public class Funtion_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 7;
		int b = 9;
		System.out.println(Addition(a, b));
//		int x=Addition(a, b);
//		System.out.println(x);
		System.out.println("Bye");

	}

	public static int Addition(int a, int b) {
		int c = a + b;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}





