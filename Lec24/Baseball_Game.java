package Lec24;

import java.util.Stack;

public class Baseball_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };

	}

	public static int cal_Points(String[] ops) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ops.length; i++) {
			String s = ops[i];
			if (s.equals("+")) {
				int a = st.pop();
				int b = st.peek();
				st.push(a);
				st.add(a + b);

			} else if (s.equals("C")) {
				st.pop();

			} else if (s.equals("D")) {
				int x = st.peek();
				st.push(2 * x);

			} else {
				st.push(Integer.parseInt(s));
			}
		}
		int sum = 0;
		for (int x : st) {
			sum += x;
		}
		return sum;
	}

}
