package Lec35;

import java.util.PriorityQueue;

public class Minimum_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 4 };
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int ans = 0;
		while (pq.size()>1) {
			int a = pq.poll();
			int b = pq.poll();
			ans += a + b;
			pq.add(a + b);
		}
		System.out.println(ans);

	}

}
