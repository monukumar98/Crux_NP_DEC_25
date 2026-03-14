package Lec19;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 787;
		System.out.println(Isprime(n));

	}

	public static boolean Isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
