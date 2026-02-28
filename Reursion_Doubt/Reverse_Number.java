package Reursion_Doubt;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=768;
		//System.out.println(Reverse(n, 0));
		int x=Reverse(n, 0);
		if(x==n) {
			
		}

	}

	public static int Reverse(int n, int ans) {
		if (n == 0) {
			return ans;
		}

		int rem = n % 10;
		return Reverse(n / 10, ans * 10 + rem);
	}

}
