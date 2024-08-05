import java.util.*;

public class ShortPath {

    // Function to find the shortest path using BFS
    public static List<Integer> shortestPath(int V, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Construct the graph
        for (int i = 0; i < V; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u); // Undirected graph
        }

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        queue.offer(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == destination) {
                // Reconstruct the path
                List<Integer> path = new ArrayList<>();
                while (current != -1) {
                    path.add(current);
                    current = parent.get(current) != null ? parent.get(current) : -1;
                }
                Collections.reverse(path);
                return path;
            }
            List<Integer> neighbors = graph.get(current);
            if (neighbors != null) {
                for (int neighbor : neighbors) {
                    if (!parent.containsKey(neighbor)) {
                        parent.put(neighbor, current);
                        queue.offer(neighbor);
                    }
                }
            }
        }
        return null; // If destination is unreachable
    }

    public static void main(String[] args) {
        int V = 8;
        int E = 10;
        int[][] edges = {
                {0, 1}, {1, 2}, {0, 3}, {3, 4}, {4, 7},
                {3, 7}, {6, 7}, {4, 5}, {4, 6}, {5, 6}
        };
        int source = 0;
        int destination = 7;

        List<Integer> shortestPath = shortestPath(V, edges, source, destination);
        System.out.println(shortestPath);
    }
}
