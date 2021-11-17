public class Ex4{
    public void BFS(int s){
        boolean visited[] = new boolean[NUMBER_OF_VERTICES];
        
        Queue <Integer > queue = new LinkedList <Integer >();
        
        visited[s] = true;
        queue.add(s);
        
        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x + " ");
            for(int i = 0; i < NUMBER_OF_VERTICES; i++){
                if(adj[x][i] != 0 && visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void DFS_recur(int v, boolean[] visited){
        visited[v] = true;
        
        System.out.print(v + " ");
        
        for(int i = 0; i < NUMBER_OF_VERTICES; i++){
            if(adj[v][i] != 0 && visited[i] == false){
                DFS_recur(i, visited);
            }
        }
    }
        
    public void DFS(int s){
        boolean[] visited = new boolean[NUMBER_OF_VERTICES];
        DFS_recur(s, visited);
    }
            

    public static void main(String[]args){
        AdjacencyMatrix AM = new AdjacencyMatrix(3);
    }
}