package com.company.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinTimeToCollectApple {

        public static void main(String[] args) {
            int n = 7;
            int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
            List<Boolean> hasApple = Arrays.asList(false, false, true, false, true, true, false);

            System.out.println(minTime(n, edges, hasApple)); // Output: 8
        }

        public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            // Build the adjacency list representation of the tree
            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }

            // Perform DFS starting from vertex 0
            return dfs(0, graph, hasApple, new boolean[n]);
        }

        private static int dfs(int node, List<List<Integer>> graph, List<Boolean> hasApple, boolean[] visited) {
            visited[node] = true;
            int time = 0;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    time += dfs(neighbor, graph, hasApple, visited);
                }
            }

            // If the current node or any descendant has an apple, add 2 seconds (1 second to go, 1 second to come back)
            if ((hasApple.get(node) || time > 0) && node != 0) {
                time += 2;
            }

            return time;
        }
    }



