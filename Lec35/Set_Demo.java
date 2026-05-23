package Lec35;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(9);
		set.add(4);
		set.add(-2);
		set.add(6);
		set.add(7);
		set.add(1);
		System.out.println(set);
//		// contains
//		System.out.println(set.contains(7));
//		System.out.println(set.contains(71));
//		// remove
//		System.out.println(set.remove(1));
//		System.out.println(set.remove(11));
//		System.out.println(set);
//		System.out.println(set.size());
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(9);
		set1.add(4);
		set1.add(-2);
		set1.add(6);
		set1.add(7);
		set1.add(1);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(9);
		set2.add(4);
		set2.add(-2);
		set2.add(6);
		set2.add(7);
		set2.add(1);
		System.out.println(set2);

	}

}
