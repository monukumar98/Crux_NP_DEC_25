package Lec31;

public class Binary_Search_Tree {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;

	public Binary_Search_Tree(int[] in) {
		// TODO Auto-generated constructor stub
		root = Create(in, 0, in.length - 1);
	}

	private Node Create(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si>ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node(in[mid]);
		nn.left = Create(in, si, mid - 1);
		nn.right = Create(in, mid + 1, ei);
		return nn;
	}

}











