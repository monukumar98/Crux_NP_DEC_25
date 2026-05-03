package Lec32;

public interface StackI {
	public static final int x = 9;

	public void push(int item);

	public int pop();

	// java8
	public static void fun() {

	}

	default void fun1() {

	}

	// java9
	private static void fun2() {

	}
}
