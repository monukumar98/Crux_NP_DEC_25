package Lec28;

import java.util.*;

public class Qeueue_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// add last
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeFirst());
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);

	}

}






