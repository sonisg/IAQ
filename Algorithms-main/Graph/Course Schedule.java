class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the adjacency list representation of the graph
        for (int[] edge : prerequisites) {
            graph.get(edge[0]).add(edge[1]);
        }

        int[] v = new int[n];
        
        // Visit each course individually
        for (int i = 0; i < numCourses; i++) {
            if (v[i] == 0 && !visitedCourse(graph, i, v)) {
                return false;
            }
        }

        return true;
    }

    private boolean visitedCourse(List<List<Integer>> graph, int course, int[] v) {
        v[course] = 1;

        for (int neigh : graph.get(course)) {
            if (v[neigh] == 1 || (v[neigh] == 0 && !visitedCourse(graph, neigh, v))) {
                return false;
            }
        }

        v[course] = 2;

        return true;
    }
}
