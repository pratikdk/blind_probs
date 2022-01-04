import java.util.ArrayList;
import java.util.List;

public class A8_AssignDirectionsToUnDirectedEdges {

    static class Graph {
        private int V;
        private List<List<Integer>> adj;
        private int[] indegree;

        public Graph(int V) {
            this.V = V;
            this.adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                this.adj.add(new ArrayList<>());
            }
            this.indegree = new int[this.V];
        }

        public void addEdge(int u, int v) {
            this.adj.get(u).add(v);
            indegree[v]++;
        }

        public List<Integer> topologicalSort() {
            List<Integer> res = new ArrayList<>();
            boolean[] visited = new boolean[this.V];

            while (res.size() != this.V) { 
                for (int i = 0; i < this.V; i++) {
                    if (!visited[i] && indegree[i] == 0) {
                        res.add(i);
                        visited[i] = true;
                        for (int v: adj.get(i)) {
                            indegree[v]--;
                        }
                    }
                }
            }

            return res;
        }
    }
    
    public static void main(String[] args) {
        
    }
}
