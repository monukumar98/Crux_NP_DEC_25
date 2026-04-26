package Lec30;

import java.util.*;

public class Binary_Tree_Right_Side_View {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int max_depth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightView(root, ll, 1);
			return ll;
		}

		public void rightView(TreeNode root, List<Integer> ll, int curr) {
			if (root == null) {
				return;
			}
			if(max_depth<curr) {
				ll.add(root.val);
				max_depth=curr;
			}

			rightView(root.right, ll, curr + 1);
			rightView(root.left, ll, curr + 1);
		}
	}
}













