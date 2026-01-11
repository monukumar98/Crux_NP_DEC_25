package Lec6;

public class Funtion_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 7;
		int b = 9;
		System.out.println(val);// 100
		System.out.println(Addition(a, b));
		System.out.println(val);//
		System.out.println("Bye");

	}

	public static int Addition(int a, int b) {
		int c = a + b;
		int val = 80;
		Funtion_Demo3.val = val - 5;
		return c;
	}

}
