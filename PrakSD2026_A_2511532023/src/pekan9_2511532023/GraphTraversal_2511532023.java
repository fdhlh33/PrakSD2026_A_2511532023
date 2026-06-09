package pekan9_2511532023;
import java.util.*;

public class GraphTraversal_2511532023 {
	private Map<String, List<String>> graph_2023 = new HashMap<>();
	
	// Menambahkan edge (graf tak berarah)
	public void addEdge_2023(String node1_2023, String node2_2023) {
		graph_2023.putIfAbsent(node1_2023,  new ArrayList<>());
		graph_2023.putIfAbsent(node2_2023,  new ArrayList<>());
		graph_2023.get(node1_2023).add(node2_2023);
		graph_2023.get(node2_2023).add(node1_2023);
	}
	// Menampilkan graf awal
	public void printGraph_2023() {
		System.out.println("Graf Awal (Adjacency List):");
		for (String node_2023 : graph_2023.keySet()) {
			System.out.print(node_2023 + " -> ");
			List<String> neighbors_2023 = graph_2023.get(node_2023);
			System.out.println(String.join(", ", neighbors_2023));
		}
		System.out.println();
	}
	
	// DFS rekursif
	public void dfs_2023(String start_2023) {
		Set<String> visited_2023 = new HashSet<>();
		System.out.println("Penelusuran DFS: ");
		dfsHelper_2023(start_2023, visited_2023);
		System.out.println();
	}
	private void dfsHelper_2023(String current_2023, Set<String> visited_2023) {
		if (visited_2023.contains(current_2023)) return;
		visited_2023.add(current_2023);
		System.out.print(current_2023 + " ");
		for (String neighbor_2023 : graph_2023.getOrDefault(current_2023, new ArrayList<>())) {
			dfsHelper_2023(neighbor_2023, visited_2023);
		}
	}
	// BFS iteratif
	public void bfs_2023(String start) {
		Set<String> visited_2023 = new HashSet<>();
		Queue<String> queue_2023 = new LinkedList<>();
		queue_2023.add(start);
		visited_2023.add(start);
		System.out.println("Penelusuran BFS: ");
		while (!queue_2023.isEmpty()) {
			String current_2023 = queue_2023.poll();
			System.out.print(current_2023 + " ");
			for (String neighbor_2023 : graph_2023.getOrDefault(current_2023,  new ArrayList<>())) {
				if (!visited_2023.contains(neighbor_2023)) {
					queue_2023.add(neighbor_2023);
					visited_2023.add(neighbor_2023);
				}
			}
		}
		System.out.println();
	}
	// Main
	public static void main(String[] args) {
		GraphTraversal_2511532023 graph_2023 = new GraphTraversal_2511532023();
		
		// Contoh graf: A-B, A-C, B-D, B-E
		graph_2023.addEdge_2023("A", "B");
		graph_2023.addEdge_2023("A", "C");
		graph_2023.addEdge_2023("B", "D");
		graph_2023.addEdge_2023("B", "E");
		// Cetak graf awal
		System.out.println("Graf Awal adalah: ");
		graph_2023.printGraph_2023();
		// Lakukan penelusuran
		graph_2023.dfs_2023("A");
		graph_2023.bfs_2023("A");
	}
}