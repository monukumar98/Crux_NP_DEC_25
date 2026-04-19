package Lec28;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.find(40));
		bt.PostOrder();
		bt.PreOrder();
		bt.InOrder();
		bt.levelOrder();

	}

}
