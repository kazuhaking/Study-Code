import java.util.Vector;

class IntegerTriple{
    private Integer weight;
    private Integer source;
    private Integer dest;
    
    public IntegerTriple(Integer w, Integer s, Integer d){
        weight = w;
        source = s;
        dest = d;
    }
    public Integer getWeight (){
    return weight;
    }
        
    public Integer getSource (){
        return source;
    }
        
    public Integer getDest (){
        return dest;
    }
        
    @Override
    public String toString (){
        return weight + " " + source + " " + dest;
    }
}


public class EdgeList{
    private Vector <IntegerTriple > edges;
    
    public EdgeList (){
        edges = new Vector <IntegerTriple >();
    }
    
    public void addEdge(int w, int u, int v){
        edges.add(new IntegerTriple(w,u,v));
    }
    
    public void printGraph (){
        for(int i = 0; i < edges.size(); i++)
            System.out.println(edges.get(i));
    }

    public static void main(String[]args){
        //none
    }
}