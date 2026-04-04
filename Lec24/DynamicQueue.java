package Lec24;

import Lec23.Queue;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int x) throws Exception {
		if (isfull()) {
			int[] new_arr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				new_arr[i] = arr[idx];
			}
			arr = new_arr;
			front = 0;

		}

		// old logic
		super.Enqueue(x);
	}
	public static void main(String[] args) throws Exception {
		DynamicQueue dq  = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();
	}

}
