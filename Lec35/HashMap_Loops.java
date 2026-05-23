package Lec35;

import java.util.*;

public class HashMap_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 67);
		map.put("Ankit", 88);
		map.put("Amisha", 57);
		map.put("Shivam", 89);
		map.put("Pooja", 57);
		map.put("Ankita", 78);
		map.put("Kunal", 93);
		map.put("Shivam", 77);
		// System.out.println(map);
		// System.out.println(map.keySet());
//		Set<String> k = map.keySet();
//		System.out.println(k);
		for (String key :  map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
