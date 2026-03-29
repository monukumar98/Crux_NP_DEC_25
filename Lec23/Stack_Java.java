package Lec23;
import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
//		ArrayList<Integer> ll = new ArrayList<>(19);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		System.out.println(st.capacity());
		System.out.println(st.size());
		// remove
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		// view 
		System.out.println(st.peek());
		System.out.println(st);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(71);
		System.out.println(st.size());
		System.out.println(st.capacity());
		System.out.println(st.isEmpty());
		for(int x:st) {
			System.out.print(x+" ");
		}
		System.out.println();

	}

}















