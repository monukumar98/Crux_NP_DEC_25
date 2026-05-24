package Lec36;

import java.util.HashMap;

public class Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram", t = "nagaram";

	}

	public static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch) || map.get(ch) == 0) {
				return false;
			}
			else {
				map.put(ch, map.get(ch) - 1);
			}
		}
		for(char ch:map.keySet()) {
			if(map.get(ch)>0) {
				return false;
			}
		}
		return true;
	}

}




