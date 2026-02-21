package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();// 10
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(0, -9);// O(N)
		ll.add(3);
		ll.add(5);
		ll.add(7);
		ll.add(2);
		ll.add(5);
		ll.add(7);
		ll.add(-7);
		System.out.println(ll);
	}

}
