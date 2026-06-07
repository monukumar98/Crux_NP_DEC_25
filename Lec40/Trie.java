package Lec40;

import java.util.HashMap;

public class Trie {
	class Node {
		char ch;
		HashMap<Character, Node> child;
		boolean isterminal;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			child = new HashMap<>();
		}
	}

	private Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}

	public void insert(String word) {// raj
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				Node node = new Node(ch);
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;
	}

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return curr.isterminal;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}

}
