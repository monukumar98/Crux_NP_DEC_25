package Lec36;

import java.util.*;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;

		public Node(K key, V value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}
	}

	private ArrayList<Node> ll;
	private int size = 0;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		ll = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ll.add(null);
		}
	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = ll.get(idx);
		Node nn = new Node(key, value);
		size++;
		nn.next = temp;
		ll.set(idx, nn);
		double lf = (1.0 * size) / ll.size();
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	public V get(K key) {
		int idx = hashfun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean containsKey(K key) {
		int idx = hashfun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = ll.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {

				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {
			ll.set(idx, curr.next);
		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return curr.value;

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> new_ll = new ArrayList<>();
		for (int i = 0; i < 2 * ll.size(); i++) {
			new_ll.add(null);
		}
		ArrayList<Node> old_ll = ll;
		ll = new_ll;
		size = 0;
		for (Node nn : old_ll) {
			while (nn != null) {
				put(nn.key, nn.value);
				nn = nn.next;
			}
		}

	}

	@Override
	public String toString() {
		String s="{";
		for (Node nn : ll) {
			while (nn != null) {
				s=s+ nn.key+"="+nn.value+", ";
				nn = nn.next;
			}
		}
		return s+"}";
	}

	public int hashfun(K key) {
		int idx = key.hashCode() % ll.size();
		if (idx < 0) {
			idx += ll.size();
		}
		return idx;
	}

}
