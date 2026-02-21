package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(0, -9);// O(N)
		ll.add(3);
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		// get
		System.out.println(ll.get(1));// O(1)
		// remove
		System.out.println(ll.remove(3));// O(N)
		System.out.println(ll);
		System.out.println(ll.size());
		// set--> update
		System.out.println(ll.set(2, -7));
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);

	}

}
