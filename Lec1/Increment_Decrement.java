package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
//		System.out.println(a++);// a = a + 1
//		System.out.println(a);// 8
//		int c = 9;
//		System.out.println(--c);// c = c - 1
//		System.out.println(c);
//		int x = a++ - ++a + --a;
//		System.out.println(x);//  6 
		int x = a++ - --a + --a + a-- - ++a;//6 

	}

}
