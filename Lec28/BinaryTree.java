package Lec28;

import java.util.*;

public class BinaryTree {
	private class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		int x = sc.nextInt();
		Node nn = new Node(x);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = createTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = createTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<-" + nn.val + "->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = max(nn.left);
		int rmax = max(nn.right);
		return Math.max(nn.val, Math.max(lmax, rmax));

	}

	public boolean find(int item) {
		// TODO Auto-generated method stub
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		// TODO Auto-generated method stub
		if(nn==null) {
			return false;
		}
		if(nn.val==item) {
			return true;
		}
		boolean left=find(nn.left, item);
		boolean right=find(nn.right, item);
		return left||right;

	}
	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if(node==null){
			return -1;
		}
		int lh=ht(node.left);
		int rh=ht(node.right);
		return Math.max(lh, rh)+1;
		
	}
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.val+" ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}
	
	private void InOrder(Node node) {
		if(node==null) {
			return;
		}
		
		InOrder(node.left);
		System.out.print(node.val+" ");
		InOrder(node.right);
	}
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		if(node==null) {
			return;
		}		
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val+" ");
	}
	public  void levelOrder() {
		Queue<Node> q = new  LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.val+" ");
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
		System.out.println();
	}

}


















