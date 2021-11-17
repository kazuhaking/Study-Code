public class Node{
    Integer key;
    Node left,right;
    int height;
    
    public Node(Integer key){
        this.key = key;
        this.height = 0;
        this.left = this.right = null;
    }

    public int height(Node node){
        if (node == null)
            return -1;
        return node.height;
    }

    public void printInfo() {
		System.out.print(this.key+ " " +this.height + "\n"); 
	}
	 
	public boolean greaterThan(int key) {
		return this.key > key;
	} 
	
	public boolean lessThan(int key) {
		return this.key < key;
	} 
	
	public boolean equal(int key) {
		return this.key == key;
	}
}