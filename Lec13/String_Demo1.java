package Lec13;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);// Address compare
		System.out.println(s4 == s3);
		System.out.println(s1.equals(s3));// value compare
		System.out.println(s1.length());// Method
		int[] arr = new int[3];
		System.out.println(arr.length);// variable
		System.out.println(s1.charAt(2));// 2nd index ka char

	}

}
