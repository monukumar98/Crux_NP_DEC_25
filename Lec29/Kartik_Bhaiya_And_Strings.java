package Lec29;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababbababababaaabbabaa";
		int k = 2;
		int flip_a = maximum_len(s, k, 'a');
		int flip_b = maximum_len(s, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int maximum_len(String s, int k, char ch) {
		int si = 0, ei = 0, ans = 0, flip = 0;
		while (ei < s.length()) {
			// window grow
			if (s.charAt(ei) == ch) {
				flip++;
			}
			// window shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans update
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}

		return ans;
	}

}
