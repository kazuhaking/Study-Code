public class Node{
    public Node next;
    public int data;

    public Node(){
        this(null, 0);
    }

    public Node(Node next, int data){
        this.next = next;
        this.data = data;
    }

    public Node getNext(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public void setNext(Node next){
        this.next = next;
    }
}