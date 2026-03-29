package Lec23;

public class Stack {

	private int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean isEmpty() {
		return idx == -1;
	}

	// O(1)
	public boolean isfill() {
		return idx == arr.length - 1;
	}

	// O(1)
	public void push(int x) throws Exception {
		if (isfill()) {
			throw new Exception("Stack full hogya bklol");
		}
		arr[++idx] = x;
	}

	// O(1)
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack Empty hai bklol");
		}
		return arr[idx];
	}

	// O(1)
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack Empty hai bklol");
		}
		return arr[idx--];
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int size() {
		return idx + 1;
	}

}
