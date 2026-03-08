package Lec18;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;// total Queen
		boolean[] baord = new boolean[n];
		Combination(baord, tq, "", 0,0);

	}

	public static void Combination(boolean[] baord, int tq, String ans, int qpsf,int idx) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < baord.length; i++) {
			if (baord[i] == false) {
				baord[i] = true;
				Combination(baord, tq, ans + "b" + i + "q" + qpsf, qpsf + 1,i+1);
				baord[i] = false;
			}

		}

	}
}
