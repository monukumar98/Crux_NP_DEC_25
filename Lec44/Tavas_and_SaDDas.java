package Lec44;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "474774";
		System.out.println(Index(s));

	}

	public static int Index(String s) {
		int n = s.length();
		int x = (1 << n) - 2;
		int y = 0;
		int pos = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				y += (1 << pos);
			}
			pos++;
		}
		return x + y + 1;
	}

}
