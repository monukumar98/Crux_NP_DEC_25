package Lec36;

import java.util.HashMap;
import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

	}

	public static List<List<String>> GroupAnagrams(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			String key = Gen_Key(s);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);

		}
		List<List<String>> ans = new ArrayList<>();
		for (String key : map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;

	}

	private static String Gen_Key(String s) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();

	}

}
