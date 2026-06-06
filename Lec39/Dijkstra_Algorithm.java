package Lec39;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void Dijkstra_Algo(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp=pq.poll();
			// 2. Ignore if Already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.vtx);
			// 4. Self work
			System.out.println(rp);
			// 5. Add nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acq_path+nbrs, rp.cost+cost));
					
				}

			}
		}

	}

	class DijkstraPair {
		int vtx;
		int cost;
		String acq_path;

		public DijkstraPair(int vtx, String acq_path, int cost) {
			// TODO Auto-generated constructor stub
			this.acq_path = acq_path;
			this.cost = cost;
			this.vtx = vtx;
		}

		@Override
		public String toString() {
			return vtx + " " + acq_path + " @ " + cost;
		}
	}
	public static void main(String[] args) {
		Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 2, 2);
		dj.AddEdge(2, 3, 3);
		dj.AddEdge(1, 4, 10);
		dj.AddEdge(4, 5, 8);
		dj.AddEdge(3, 4, 1);
		dj.AddEdge(5, 6, 5);
		dj.AddEdge(5, 7, 6);
		dj.AddEdge(6, 7, 4);
		dj.Dijkstra_Algo(1);
	}

}
