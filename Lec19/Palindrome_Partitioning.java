package Lec19;
import java.util.*;
public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		Partitionin(ques, ll);

	}

	public static void Partitionin(String ques, List<String> ll) {
		if (ques.length() == 0) {
			System.out.println(ll);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (isPalindrom(s)) {
				ll.add(s);
				Partitionin(ques.substring(i), ll);
				ll.remove(ll.size()-1);
			}
		}

	}

	public static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
