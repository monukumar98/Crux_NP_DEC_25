package Lec27;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode dummy = new ListNode();
			ListNode temp = dummy;
			ListNode prevstart=head;
			while (head != null) {
				// k element stack push krna hai
				while (head != null && st.size() < k) {
					st.push(head);
					head = head.next;
				}

				// k element ko stack pop krke attach krna hai
				if (st.size() == k) {
					prevstart=head;
					while (!st.isEmpty()) {
						dummy.next = st.pop();
						dummy = dummy.next;
					}
				}
				else {
					dummy.next=prevstart;
				}

			}
			return temp.next;
		}
	}
}
