package Lec36;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
	}

	public static int Longest_Sequence(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			int x=arr[i];
			if(set.contains(x) && !set.contains(x-1)) {
				int c=0;
				while(set.contains(x)) {
					set.remove(x);
					c++;
					x++;
				
				}
				ans=Math.max(ans, c);
			}
		}
		return ans;

	}

}
