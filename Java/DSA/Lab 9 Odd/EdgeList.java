import java.util.*;
    
public class EdgeList{
    private Vector <IntegerTriple > edges;
    private int number;

    public EdgeList(){
        edges = new Vector <IntegerTriple >();
        number = 0;
    }

    public void addEdge(int w, int u, int v){
        edges.add(new IntegerTriple(w,u,v));
        number++;
    }

    public int numberOfEdge(){
        return this.number;
    }

    public void printGraph(){
        for(int i = 0; i < edges.size(); i++){
            System.out.println(edges.get(i));
        }
    }

    public int numberOfVert(){
        int count = 0;
        for(int i = 0; i < edges.size(); i++){
            count++;
        }
        return count;
    }
} 