package Lec33;

public class LinkedList<T> {

	private class Node {
		T val;
		Node next;

		public Node(T val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addfirst(T item) {
		Node nn = new Node(item);
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;

		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addlast(T item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node(item);
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(N)
	public void addindex(T item, int k) {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node nn = new Node(item);
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	// O(N)
	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(N)
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "--> ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public T getfirst() {
		return head.val;
	}

	// O(1)
	public T getlast() {
		return tail.val;
	}

	// O(N)
	public T getindex(int k) {
		return getNode(k).val;
	}

	// O(1)
	public T removefirst() {
		Node curr = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			curr.next = null;
			size--;
		}
		return curr.val;
	}

	// O(N)
	public T removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			T val = tail.val;
			Node prev = getNode(size - 2);
			prev.next = null;
			tail = prev;
			size--;
			return val;
		}
	}

	// O(N)
	public T removeindex(int k) {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}

	}

}
