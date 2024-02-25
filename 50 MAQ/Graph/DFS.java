package com.company.graph;

import java.util.ArrayList;

public class DFSGraph {

        public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

            boolean[] visited = new boolean[V];
            ArrayList<Integer>result= new ArrayList<>();
            for(int i =0;i<V;i++){
                if(!visited[i]){
                    dfsUtil(i, adj, visited, result);
                }
            }

            return result;
        }

        private void dfsUtil(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
            visited[vertex] = true;
            result.add(vertex);

            for (int neighbor : adj.get(vertex)) {
                if (!visited[neighbor]) {
                    dfsUtil(neighbor, adj, visited, result);
                }
            }
        }

    public static void main(String[] args) {
        DFSGraph dfsGraph = new DFSGraph();

        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example graph edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);
        adj.get(4).add(4);

        ArrayList<Integer> dfsResult = dfsGraph.dfsOfGraph(V, adj);
        System.out.println("Depth First Traversal: " + dfsResult);
    }


}
