package Lec18;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;// total Queen
		boolean[] baord = new boolean[n];
		Permutation(baord, tq, "", 0);

	}

	public static void Permutation(boolean[] baord, int tq, String ans, int qpsf) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < baord.length; i++) {
			if (baord[i] == false) {
				baord[i] = true;
				Permutation(baord, tq, ans + "b" + i + "q" + qpsf, qpsf + 1);
				baord[i] = false;
			}

		}

	}

}
