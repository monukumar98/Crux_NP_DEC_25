package Lec40;

import java.util.HashMap;

import Lec40.Trie.Node;

public class Tries_Contacts {
	class Node {
		char ch;
		HashMap<Character, Node> child;
		boolean isterminal;
		int c = 1;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			child = new HashMap<>();
		}
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}
	public void insert(String word) {// raj
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.c++;
			} else {
				Node node = new Node(ch);
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;
	}
	public int search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.c;
	}
}








