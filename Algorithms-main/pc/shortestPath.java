package pc;

import java.util.*;

public class shortestPath {

    private static List<Integer> shortestPath(int[][] edges, int s, int d, int V) {
        List<List<Integer>> gp = new ArrayList<>();
        for(int i=0;i<V;i++){
            gp.add(new ArrayList<>());
        }
        for(int[]e: edges){
            int u=e[0];
            int v = e[1];
            gp.get(u).add(v);
            gp.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        q.add(s);
        h.put(s,null);

        while(!q.isEmpty()){
            int c = q.poll();
            if(c==d){
                List<Integer> path = new ArrayList<>();
                while(c!=-1){
                    path.add(c);
                    c = h.get(c);
                }
                Collections.reverse(path);
                return path;
            }
            for(int n: gp.get(c)){
                q.add(n);
                h.put(n,c);
            }
        }
        return null;
    }

    public static void main(String args[]) {
        int v = 8;
        int s=0;
        int d=3;
        int e = 10;
        int[][] edges = {
                {0, 1}, {1, 2}, {0, 3}, {3, 4}, {4, 7},
                {3, 7}, {6, 7}, {4, 5}, {4, 6}, {5, 6}
        };
        List<Integer> shortestPath = shortestPath(edges, s, d, v);
        System.out.println(shortestPath);
    }
}
