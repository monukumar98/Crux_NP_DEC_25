package Lec40;

import java.util.*;

public class Topological_Sort {
	private HashMap<Integer, List<Integer>> map;

	public Topological_Sort(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {
			map.put(i, new ArrayList<>());
		}
	}

	public void AddEdge(int v1, int v2) {
		map.get(v1).add(v2);
	}

	public int[] Indegree() {
		int[] in = new int[map.size()];
		for (int v : map.keySet()) {
			for (int nbrs : map.get(v)) {
				in[nbrs]++;
			}

		}
		return in;

	}
	public void Topological() {
		int [] in=Indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int v=q.remove();
			System.out.print(v+" ");
			for(int nbrs:map.get(v)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
	}

}











