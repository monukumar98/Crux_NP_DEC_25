package Lec13;

import java.util.Scanner;

public class String_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello" + 10 + 20 + "Bye");
		System.out.println("Hello" + (10 + 20) + "Bye");
		System.out.println(10 + 20 + "Hello" + "Bye");
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		System.out.println(s);
	}

}
