package com.company.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public BFSGraph(int vertices) {

        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adjacencyList[v].add(w);
    }

    private void BFS(int s) {
        boolean [] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.print(s + " ");
            for (int neighbor : adjacencyList[s]) {
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
