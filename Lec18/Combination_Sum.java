package Lec18;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		int[] coin = { 2, 3, 5 };
		int ammount = 8;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination(coin, ammount, ll, 0, ans);
		System.out.println(ans);

	}

	public static void Combination(int[] coin, int ammount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if (ammount == 0) {
			// System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (ammount >= coin[i]) {
				// ammount -= coin[i];
				ll.add(coin[i]);
				Combination(coin, ammount - coin[i], ll, i, ans);
				// ammount += coin[i];
				ll.remove(ll.size() - 1);

			}

		}

	}

}
