package Lec18;

public class Coin_Combination {

	public static void main(String[] args) {
		int[] coin = { 2, 3, 5 };
		int ammount = 8;
		Combination(coin, ammount, "",0);

	}

	public static void Combination(int[] coin, int ammount, String ans,int idx) {
		// TODO Auto-generated method stub
		if (ammount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (ammount >= coin[i]) {
				// ammount -= coin[i];
				Combination(coin, ammount - coin[i], ans + coin[i],i);
				// ammount += coin[i];

			}

		}

	}

}
