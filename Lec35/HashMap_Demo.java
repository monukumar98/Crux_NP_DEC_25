package Lec35;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 67);
		map.put("Ankit", 88);
		map.put("Amisha", 57);
		map.put("Shivam", 89);
		map.put("Pooja", 57);
		map.put("Ankita", 78);
		map.put("Kunal", 93);
		map.put("Shivam", 77);
//		map.put(null, 17);
		System.out.println(map);
//		// get
//		System.out.println(map.get("Raj"));
//		System.out.println(map.get("Rajesh"));
//		// remove
//		System.out.println(map.remove("Raj"));
//		System.out.println(map.remove("Rajesh"));
//		System.out.println(map);
//		// containsKey
//		System.out.println(map.containsKey("Ankit"));
//		System.out.println(map.containsKey("Rajesh"));
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 67);
		map1.put("Ankit", 88);
		map1.put("Amisha", 57);
		map1.put("Shivam", 89);
		map1.put("Pooja", 57);
		map1.put("Ankita", 78);
		map1.put("Kunal", 93);
		map1.put("Shivam", 77);
//		map1.put(null, 17);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 67);
		map2.put("Ankit", 88);
		map2.put("Amisha", 57);
		map2.put("Shivam", 89);
		map2.put("Pooja", 57);
		map2.put("Ankita", 78);
		map2.put("Kunal", 93);
		map2.put("Shivam", 77);
//		map2.put(null, 17);
		System.out.println(map2);
		

	}

}
