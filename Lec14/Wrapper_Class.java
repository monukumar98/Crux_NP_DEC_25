package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 9;
		int a2 = 7;
		System.out.println(a1);
		System.out.println(a2);
		long l = 980;
		Long l1 = 655789l;
		Integer b = a2;// Auto-Boxing
		int c = a1;// Un-Boxing

		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 191;
		Integer c4 = 191;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);

		Boolean f1 = true;
		Boolean f2 = true;
		System.out.println(f1 == f2);
		Character ch1 = 'a';
		Character ch2 = 'a';
		System.out.println(ch1==ch2);
	

	}

}
