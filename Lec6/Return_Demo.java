package Lec6;

public class Return_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();

	}

	public static int  fun() {

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				return -9;
			}
			System.out.println(i);

		}
		System.out.println("Bye");
		return 0;
	}
}
