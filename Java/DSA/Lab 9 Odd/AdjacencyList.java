import java.util.*;

public class AdjacencyList{
    private int V; // No. of vertices
    private LinkedList <Integer > adj[];
    private int numberOfEdge;
    public AdjacencyList(int v){
        V = v;
        numberOfEdge = 0;
        adj = new LinkedList[v];

        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList <Integer >();
    }
        
    public void addEdge(int u, int v){
        adj[u].add(v);
        numberOfEdge++;
    }
        
    public void printGraph(){
        for(int i = 0; i < V; i++){
            System.out.print("Vertex " + i + ": ");
            System.out.print("head");
            for(Integer v: adj[i]){
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }
}