package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(0, -9);// O(N)
		ll.add(3);
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		// for each loops
		int [] arr = new int [5];
		for(int x:arr) {
			System.out.print(x+" ");
			
		}
		System.out.println();
         for(int x:ll) {
        	 System.out.print(x+" ");
		}
	}

}









