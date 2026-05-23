package Lec35;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_demo_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// max heap
		pq.add(5);
		pq.add(7);
		pq.add(9);
		pq.add(2);
		pq.add(3);
		pq.add(1);
		System.out.println(pq);

	}

}
