package Lec44;

public class Check_Ith_Bits_Is_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 4;
		int mask = (1 << i);
		if ((n & mask) == 0) {
			System.out.println("Un_Set");
		} else {
			System.out.println("Set");
		}

	}

}
