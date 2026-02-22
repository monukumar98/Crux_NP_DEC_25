package Lec15;

public class Sum_of_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Sum(n));

	}

	public static int Sum(int n) {
		if(n==1) {
			return 1;
		}

		int s = Sum(n - 1);// n-1 tk sum dega
		return s+n;// n tk sum dega

	}

}
