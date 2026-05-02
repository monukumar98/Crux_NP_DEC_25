package Lec31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_level_order {

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

	public Create_Tree_Using_level_order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		root = new Node(v);
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node r =q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				r.left=new Node(c1);
				q.add(r.left);
			}
			if(c2!=-1) {
				r.right=new Node(c2);
				q.add(r.right);
			}
			
		}
	}

}















