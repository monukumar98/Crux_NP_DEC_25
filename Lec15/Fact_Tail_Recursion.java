package Lec15;

public class Fact_Tail_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fac(n, 1));
	}

	public static int Fac(int n, int ans) {
		// Base case
		if (n == 0) {
			return ans;
		}
		return Fac(n, ans*n);

	}

}
