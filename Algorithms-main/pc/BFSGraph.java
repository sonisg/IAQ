package pc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {

    private int vertices;
    private List<List<Integer>> adjacencyList;

    public BFSGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w){
        if (v >= 0 && v < vertices) {
            adjacencyList.get(v).add(w);
        } else {
            throw new IllegalArgumentException("Vertex out of bounds");
        }
    }

    private void BFS(int s) {
        boolean [] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.print(s + " ");
            for (int neighbor : adjacencyList.get(s)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSGraph graph = new BFSGraph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("BFS starting from vertex 2:");
        graph.BFS(2);
    }
}
